package rest.service;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmailSubscriptionService {
    @POST("repo/{repositoryId}/email_subscription")
    Single<Response<Void>> subscribeToEmail(@Path("repositoryId") int repositoryId);

    @POST("repo/{repositorySlug}/email_subscription")
    Single<Response<Void>> subscribeToEmail(@Path("repositorySlug") String repositorySlug);

    @DELETE("repo/{repositoryId}/email_subscription")
    Single<Response<Void>> cancelEmailSubscription(@Path("repositoryId") int repositoryId);

    @DELETE("repo/{repositorySlug}/email_subscription")
    Single<Response<Void>> cancelEmailSubscription(@Path("repositorySlug") String repositorySlug);
}
