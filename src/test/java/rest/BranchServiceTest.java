package rest;

import org.junit.jupiter.api.Test;
import rest.entity.Branch;
import rest.entity.Branches;

public class BranchServiceTest extends BaseRestServiceTest {

    @Test
    public void getBranchesByRepositoryId() {
        Branches branches = travisApiClient.getBranchService().getBranchesByRepositoryId(repositoryId).blockingGet();
        assertResponse(branches);
    }

    @Test
    public void getBranchByRepositoryId() {
        Branch branch = travisApiClient.getBranchService().getBranchByRepositoryId(repositoryId, branchName).blockingGet();
        assertResponse(branch);
    }

    @Test
    public void getBranchBySlug() {
        Branch branch = travisApiClient.getBranchService().getBranchBySlug(repositorySlug, branchName).blockingGet();
        assertResponse(branch);
    }

    @Test
    public void getBranchesBySlug() {
        Branches branches = travisApiClient.getBranchService().getBranchesBySlug(repositorySlug).blockingGet();
        assertResponse(branches);
    }

}
