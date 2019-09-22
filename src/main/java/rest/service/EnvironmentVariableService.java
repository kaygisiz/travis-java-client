package rest.service;

import io.reactivex.Single;
import rest.entity.EnvironmentVariable;
import rest.request.EnvironmentVariableRequest;
import rest.entity.EnvironmentVariables;
import retrofit2.Response;
import retrofit2.http.*;

import java.util.Map;

public interface EnvironmentVariableService {
    @GET("repo/{repositoryId}/env_var/{envVarId}")
    Single<EnvironmentVariable> getByRepositoryId(@Path("repositoryId") int repoId, @Path("envVarId") String envVarId);

    @GET("repo/{repositoryId}/env_var/{envVarId}")
    Single<EnvironmentVariable> getByRepositoryId(@Path("repositoryId") int repoId, @Path("envVarId") String envVarId, @QueryMap Map<String, String> queryMap);

    @GET("repo/{repositorySlug}/env_var/{envVarId}")
    Single<EnvironmentVariable> getByRepositorySlug(@Path("repositorySlug") String repoSlug, @Path("envVarId") String envVarId);

    @GET("repo/{repositorySlug}/env_var/{envVarId}")
    Single<EnvironmentVariable> getByRepositorySlug(@Path("repositorySlug") String repoSlug, @Path("envVarId") String envVarId, @QueryMap Map<String, String> queryMap);

    @PATCH("repo/{repositoryId}/env_var/{envVarId}")
    Single<EnvironmentVariable> updateByRepositoryId(@Path("repositoryId") int repoId, @Path("envVarId") String envVarId, @Body EnvironmentVariableRequest body);

    @PATCH("repo/{repositoryId}/env_var/{envVarId}")
    Single<EnvironmentVariable> updateByRepositoryId(@Path("repositoryId") int repoId, @Path("envVarId") String envVarId, @Body EnvironmentVariableRequest body, @QueryMap Map<String, String> queryMap);

    @PATCH("repo/{repositorySlug}/env_var/{envVarId}")
    Single<EnvironmentVariable> updateByRepositorySlug(@Path("repositorySlug") String repoSlug, @Path("envVarId") String envVarId, @Body EnvironmentVariableRequest body);

    @PATCH("repo/{repositorySlug}/env_var/{envVarId}")
    Single<EnvironmentVariable> updateByRepositorySlug(@Path("repositorySlug") String repoSlug, @Path("envVarId") String envVarId, @Body EnvironmentVariableRequest body, @QueryMap Map<String, String> queryMap);

    @DELETE("repo/{repositoryId}/env_var/{envVarId}")
    Single<Response<Void>> delete(@Path("repositoryId") int repoId, @Path("envVarId") String envVarId);

    @DELETE("repo/{repositorySlug}/env_var/{envVarId}")
    Single<Response<Void>> delete(@Path("repositorySlug") String repoSlug, @Path("envVarId") String envVarId);

    @GET("repo/{repositoryId}/env_vars")
    Single<EnvironmentVariables> getByRepositoryId(@Path("repositoryId") int repoId);

    @GET("repo/{repositoryId}/env_vars")
    Single<EnvironmentVariables> getByRepositoryId(@Path("repositoryId") int repoId, @QueryMap Map<String, String> queryMap);

    @GET("repo/{repositorySlug}/env_vars")
    Single<EnvironmentVariables> getByRepositorySlug(@Path("repositorySlug") String repoSlug);

    @GET("repo/{repositorySlug}/env_vars")
    Single<EnvironmentVariables> getByRepositorySlug(@Path("repositorySlug") String repoSlug, @QueryMap Map<String, String> queryMap);
}
