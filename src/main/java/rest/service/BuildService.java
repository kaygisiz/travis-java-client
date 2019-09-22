package rest.service;

import io.reactivex.Single;
import rest.entity.Build;
import rest.entity.Builds;
import rest.response.BuildResponse;
import retrofit2.http.*;

import java.util.Map;

public interface BuildService {
    @GET("owner/{login}/active")
    Single<Builds> getActiveBuilds(@Path("login") String login);

    @GET("builds")
    Single<Builds> getBuilds(@QueryMap Map<String, String> queryMap);

    @GET("builds")
    Single<Builds> getBuilds();

    @GET("repo/{id}/builds")
    Single<Builds> getBuildsByRepositoryId(@Path("id") int repoId);

    @GET("repo/{id}/builds")
    Single<Builds> getBuildsByRepositoryId(@Path("id") int repoId, @QueryMap Map<String, String> queryMap);

    @GET("repo/{slug}/builds")
    Single<Builds> getBuildsByRepositorySlug(@Path("slug") String slug);

    @GET("repo/{slug}/builds")
    Single<Builds> getBuildsByRepositorySlug(@Path("slug") String slug, @QueryMap Map<String, String> queryMap);

    @GET("build/{id}")
    Single<Build> getBuild(@Path("id") int buildId);

    @POST("build/{id}/cancel")
    Single<BuildResponse> cancelBuild(@Path("id") int buildId);

    @POST("build/{id}/restart")
    Single<BuildResponse> restartBuild(@Path("id") int buildId);
}
