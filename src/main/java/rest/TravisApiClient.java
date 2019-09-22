package rest;

import okhttp3.*;
import rest.entity.Authentication;
import rest.request.GithubAuthRequest;
import rest.request.AuthenticationRequest;
import rest.service.*;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.nio.charset.Charset;

public class TravisApiClient {

    private static final String BASE_URL = "https://api.travis-ci.org/";
    private static final String GITHUB_AUTHORIZATION_URL = "https://api.github.com/authorizations";

    private String accessToken;

    private Retrofit retrofit;

    private AuthenticateService authenticateService;
    private GithubApiService githubApiService;

    private BuildService buildService;
    private BranchService branchService;
    private CronService cronService;
    private EmailSubscriptionService emailSubscriptionService;

    private TravisApiClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(initHttpClient())
                .build();
        initServices();
    }

    public TravisApiClient(String githubToken) {
        this();
        accessToken = authByGithubToken(githubToken).getAccessToken();
    }

    public TravisApiClient(String githubUsername, String githubPassword) {
        this();
        final String githubCredential = Credentials.basic(githubUsername, githubPassword, Charset.forName("UTF-8"));
        GithubAuthRequest githubAuthRequest = new GithubAuthRequest("temporary token to auth against travis", "public_repo");

        githubApiService
                .generateToken(GITHUB_AUTHORIZATION_URL, githubCredential, githubAuthRequest)
                .subscribe(githubToken ->
                        authenticateService.authByGithubToken(new AuthenticationRequest(githubToken.getToken()))
                                .subscribe(authenticationResponse -> {
                                    accessToken = authenticationResponse.getAccessToken();
                                    githubApiService.deleteToken(githubToken.getUrl(), githubCredential).subscribe();
                                }));
    }

    private Authentication authByGithubToken(String githubToken) {
        return authenticateService.authByGithubToken(new AuthenticationRequest(githubToken)).blockingGet();
    }

    private OkHttpClient initHttpClient() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient().newBuilder();

        clientBuilder.addInterceptor(chain -> {
            Request request = chain.request();
            System.out.println("Request: " + request.url());
            if (request.headers().get("Exclude-Global-Header") != null) {
                return proceedRequest(chain,
                        request.newBuilder()
                                .removeHeader("Exclude-Global-Header")
                                .build());
            }
            Request newRequest = request.newBuilder()
                    .header("Travis-API-Version", "3")
                    .header("User-Agent", "API Explorer")
                    .header("Authorization", "token " + accessToken)
                    .build();

            return proceedRequest(chain, newRequest);
        });

        return clientBuilder.build();
    }

    private Response proceedRequest(Interceptor.Chain chain, Request request) throws IOException {
        Response response = chain.proceed(request);
        ResponseBody responseBody = response.body();
        if (responseBody != null) {
            String responseContent = responseBody.string();
            System.out.println("Response: " + responseContent);
            return response.newBuilder().body(ResponseBody.create(responseBody.contentType(), responseContent)).build();
        }
        System.out.println("Response body is empty");
        return response.newBuilder().body(ResponseBody.create(null, "")).build();
    }

    private void initServices() {
        authenticateService = retrofit.create(AuthenticateService.class);
        githubApiService = retrofit.create(GithubApiService.class);

        buildService = retrofit.create(BuildService.class);
        branchService = retrofit.create(BranchService.class);
        cronService = retrofit.create(CronService.class);
        emailSubscriptionService = retrofit.create(EmailSubscriptionService.class);
    }

    public BuildService getBuildService() {
        return buildService;
    }

    public BranchService getBranchService() {
        return branchService;
    }

    public CronService getCronService() {
        return cronService;
    }

    public EmailSubscriptionService getEmailSubscriptionService() {
        return emailSubscriptionService;
    }
}
