package rest;

import org.junit.jupiter.api.BeforeAll;
import rest.response.BaseResponse;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseRestServiceTest {

    protected static TravisApiClient travisApiClient;
    protected static String githubToken = System.getenv("GITHUB_TOKEN");

    protected String repositorySlug = System.getenv("REPOSITORY_SLUG");
    protected int repositoryId = Integer.parseInt(System.getenv("REPOSITORY_ID"));
    protected String githubUsername = System.getenv("GITHUB_USERNAME");
    protected int buildId = Integer.parseInt(System.getenv("BUILD_ID"));
    protected String branchName = System.getenv("BRANCH_NAME");

    @BeforeAll
    public static void init() {
        travisApiClient = new TravisApiClient(githubToken);
    }

    protected <T extends BaseResponse> void assertResponse(T response) {
        assertTrue(response.isSuccess());
    }
}
