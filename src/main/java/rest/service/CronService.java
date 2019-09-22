package rest.service;

import io.reactivex.Single;
import rest.entity.Cron;
import rest.request.CreateCronRequest;
import rest.entity.Crons;
import retrofit2.Response;
import retrofit2.http.*;

import java.util.Map;

public interface CronService {
    @GET("cron/{id}")
    Single<Cron> getCron(@Path("id") int cronId);

    @GET("repo/{repositoryId}/branch/{branchName}/cron")
    Single<Cron> getCronByBranch(@Path("repositoryId") int repositoryId, @Path("branchName") String branchName);

    @GET("repo/{repositorySlug}/branch/{branchName}/cron")
    Single<Cron> getCronByBranch(@Path("repositorySlug") String repositorySlug, @Path("branchName") String branchName);

    @DELETE("cron/{id}")
    Single<Response<Void>> deleteCron(@Path("id") int cronId);

    @POST("repo/{repositoryId}/branch/{branchName}/cron")
    Single<Cron> createCron(@Path("repositoryId") int repositoryId, @Path("branchName") String branchName, @Body CreateCronRequest body);

    @POST("repo/{repositorySlug}/branch/{branchName}/cron")
    Single<Cron> createCron(@Path("repositorySlug") String repositorySlug, @Path("branchName") String branchName, @Body CreateCronRequest body);

    @GET("repo/{repositoryId}/crons")
    Single<Crons> getCrons(@Path("repositoryId") int repositoryId);

    @GET("repo/{repositoryId}/crons")
    Single<Crons> getCrons(@Path("repositoryId") int repositoryId, @QueryMap Map<String, String> queryMap);

    @GET("repo/{repositorySlug}/crons")
    Single<Crons> getCrons(@Path("repositorySlug") String repositorySlug);

    @GET("repo/{repositorySlug}/crons")
    Single<Crons> getCrons(@Path("repositorySlug") String repositorySlug, @QueryMap Map<String, String> queryMap);
}
