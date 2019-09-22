package rest.service;

import io.reactivex.Single;
import rest.entity.Authentication;
import rest.request.AuthenticationRequest;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthenticateService {
    @Headers({
            "User-Agent: TravisJavaClient/1.0.0",
            "Accept: application/vnd.travis-ci.2.1+json",
            "Content-Length: 37",
            "Exclude-Global-Header: travis-v2.1"
    })
    @POST("auth/github")
    Single<Authentication> authByGithubToken(@Body AuthenticationRequest authenticationRequest);
}
