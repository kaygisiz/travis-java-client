package rest.service;

import io.reactivex.Single;
import rest.entity.Branch;
import rest.entity.Branches;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BranchService {
    @GET("repo/{repositoryId}/branch/{branchName}")
    Single<Branch> getBranchByRepositoryId(@Path("repositoryId") int repoId, @Path("branchName") String branchName);

    @GET("repo/{slug}/branch/{branchName}")
    Single<Branch> getBranchBySlug(@Path("slug") String slug, @Path("branchName") String branchName);

    @GET("repo/{repositoryId}/branches")
    Single<Branches> getBranchesByRepositoryId(@Path("repositoryId") int repoId);

    @GET("repo/{slug}/branches")
    Single<Branches> getBranchesBySlug(@Path("slug") String slug);
}
