package rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import rest.entity.Build;
import rest.entity.Builds;
import rest.response.BuildResponse;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BuildServiceTest extends BaseRestServiceTest {

    @Order(0)
    @Test
    public void getBuild() {
        Build build = travisApiClient.getBuildService().getBuild(buildId).blockingGet();
        assertResponse(build);
        assertNotEquals(0, build.getId());
    }

    @Order(0)
    @Test
    public void getBuilds() {
        Builds builds = travisApiClient.getBuildService().getBuilds().blockingGet();
        assertResponse(builds);
    }

    @Order(0)
    @Test
    public void getBuildsByRepositoryId() {
        Builds builds = travisApiClient.getBuildService().getBuildsByRepositoryId(repositoryId).blockingGet();
        assertResponse(builds);
    }

    @Order(0)
    @Test
    public void getBuildsByRepositorySlug() {
        Builds builds = travisApiClient.getBuildService().getBuildsByRepositorySlug(repositorySlug).blockingGet();
        assertResponse(builds);
    }

    @Order(0)
    @Test
    public void getActiveBuilds() {
        Builds builds = travisApiClient.getBuildService().getActiveBuilds(githubUsername).blockingGet();
        assertResponse(builds);
    }

    @Order(1)
    @Test
    public void restartBuild() {
        BuildResponse buildResponse = travisApiClient.getBuildService().restartBuild(buildId).blockingGet();
        assertResponse(buildResponse);
        assertNotEquals(0, buildResponse.getBuild().getId());
    }

    @Order(2)
    @Test
    public void cancelBuild() {
        Build[] activeBuilds = await().atMost(5, TimeUnit.SECONDS)
                .until(() -> travisApiClient.getBuildService().getActiveBuilds(githubUsername).blockingGet().getBuilds(),
                        builds -> {
                            for (Build build : builds) {
                                if (build.getId() == buildId) {
                                    BuildResponse canceledBuild = travisApiClient.getBuildService().cancelBuild(buildId).blockingGet();
                                    assertResponse(canceledBuild);
                                    assertNotEquals(0, canceledBuild.getBuild().getId());
                                    return true;
                                }
                            }
                            return false;
                        });
        assertNotNull(activeBuilds);
    }
}
