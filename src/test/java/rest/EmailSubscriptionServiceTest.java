package rest;

import org.junit.jupiter.api.*;
import retrofit2.Response;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmailSubscriptionServiceTest extends BaseRestServiceTest {
    @Order(0)
    @Test
    public void subscribeToEmailByRepositoryId() {
        Response<Void> response = travisApiClient.getEmailSubscriptionService().subscribeToEmail(repositoryId).blockingGet();
        assertNotNull(response);
    }

    @Order(1)
    @Test
    public void cancelEmailSubscriptionByRepositoryId() {
        Response<Void> response = travisApiClient.getEmailSubscriptionService().cancelEmailSubscription(repositoryId).blockingGet();
        assertNotNull(response);
    }

    @Order(2)
    @Test
    public void subscribeToEmailByRepositorySlug() {
        Response<Void> response = travisApiClient.getEmailSubscriptionService().subscribeToEmail(repositorySlug).blockingGet();
        assertNotNull(response);
    }

    @Order(3)
    @Test
    public void cancelEmailSubscriptionByRepositorySlug() {
        Response<Void> response = travisApiClient.getEmailSubscriptionService().cancelEmailSubscription(repositorySlug).blockingGet();
        assertNotNull(response);
    }
}
