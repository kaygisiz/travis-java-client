package rest;

import org.junit.jupiter.api.*;
import rest.definition.CronInterval;
import rest.entity.Cron;
import rest.request.CreateCronRequest;
import retrofit2.Response;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CronServiceTest extends BaseRestServiceTest {

    private static int createdCronId = -1;

    @Order(0)
    @Test
    public void createCronByRepositoryId() {
        Cron cron = travisApiClient.getCronService().createCron(repositoryId, branchName, new CreateCronRequest(CronInterval.DAILY.getInterval())).blockingGet();
        assertResponse(cron);
        createdCronId = cron.getId();
    }

    @Order(1)
    @Test
    public void deleteFirstCron() {
        Response<Void> response = travisApiClient.getCronService().deleteCron(createdCronId).blockingGet();
        assertNotNull(response);
    }

    @Order(2)
    @Test
    public void createCronByRepositorySlug() {
        Cron cron = travisApiClient.getCronService().createCron(repositorySlug, branchName, new CreateCronRequest(CronInterval.WEEKLY.getInterval())).blockingGet();
        assertResponse(cron);
        createdCronId = cron.getId();
    }

    @Order(3)
    @Test
    public void getCronByRepoId() {
        Cron cron = travisApiClient.getCronService().getCronByBranch(repositoryId, branchName).blockingGet();
        assertResponse(cron);
    }

    @Order(3)
    @Test
    public void getCronByRepoSlug() {
        Cron cron = travisApiClient.getCronService().getCronByBranch(repositorySlug, branchName).blockingGet();
        assertResponse(cron);
    }

    @Order(4)
    @Test
    public void deleteSecondCron() {
        Response<Void> response = travisApiClient.getCronService().deleteCron(createdCronId).blockingGet();
        assertNotNull(response);
    }
}
