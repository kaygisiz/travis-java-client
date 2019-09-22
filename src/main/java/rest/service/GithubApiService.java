package rest.service;

import io.reactivex.Single;
import rest.request.GithubAuthRequest;
import rest.entity.GithubToken;
import retrofit2.Response;
import retrofit2.http.*;

public interface GithubApiService {

    /**
     *  url should be: https://api.github.com/authorizations
     */
    @Headers({"Exclude-Global-Header: github"})
    @POST
    Single<GithubToken> generateToken(@Url String githubApiUrl, @Header("Authorization") String credentials, @Body GithubAuthRequest body);

    /**
     *  url should be: https://api.github.com/authorizations/{token_id}
     */
    @Headers({"Exclude-Global-Header: github"})
    @DELETE
    Single<Response<Void>> deleteToken(@Url String githubApiUrl, @Header("Authorization") String credentials);
}
