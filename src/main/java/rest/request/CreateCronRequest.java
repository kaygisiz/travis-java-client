package rest.request;

import com.google.gson.annotations.SerializedName;
import rest.definition.CronInterval;

public class CreateCronRequest {
    @SerializedName("cron.interval")
    private String interval;
    @SerializedName("cron.dont_run_if_recent_build_exists")
    private boolean dontRunIfRecentBuildExists;

    public CreateCronRequest(String interval) {
        this.interval = interval;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(CronInterval cronInterval) {
        this.interval = cronInterval.getInterval();
    }

    public boolean isDontRunIfRecentBuildExists() {
        return dontRunIfRecentBuildExists;
    }

    public void setDontRunIfRecentBuildExists(boolean dontRunIfRecentBuildExists) {
        this.dontRunIfRecentBuildExists = dontRunIfRecentBuildExists;
    }
}
