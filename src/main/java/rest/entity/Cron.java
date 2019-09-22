package rest.entity;

import com.google.gson.annotations.SerializedName;
import rest.response.BaseResponse;

public class Cron extends BaseResponse {
    private int id;
    private Repository repository;
    private Branch branch;
    private String interval;
    @SerializedName("dont_run_if_recent_build_exists")
    private boolean dontRunIfRecentBuildExists;
    @SerializedName("last_run")
    private String lastRun;
    @SerializedName("next_run")
    private String nextRun;
    @SerializedName("created_at")
    private String createdAt;
    // active	Unknown	The cron's active.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public boolean isDontRunIfRecentBuildExists() {
        return dontRunIfRecentBuildExists;
    }

    public void setDontRunIfRecentBuildExists(boolean dontRunIfRecentBuildExists) {
        this.dontRunIfRecentBuildExists = dontRunIfRecentBuildExists;
    }

    public String getLastRun() {
        return lastRun;
    }

    public void setLastRun(String lastRun) {
        this.lastRun = lastRun;
    }

    public String getNextRun() {
        return nextRun;
    }

    public void setNextRun(String nextRun) {
        this.nextRun = nextRun;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
