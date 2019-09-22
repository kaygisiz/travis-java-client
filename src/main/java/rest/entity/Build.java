package rest.entity;

import com.google.gson.annotations.SerializedName;
import rest.response.BaseResponse;

public class Build extends BaseResponse {
    private int id;
    private String number;
    private String state;
    private int duration;
    @SerializedName("event_type")
    private String eventType;
    @SerializedName("previous_state")
    private String previousState;
    @SerializedName("pull_request_title")
    private String pullRequestTitle;
    @SerializedName("pull_request_number")
    private int pullRequestNumber;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("finishedAt")
    private String finished_at;
    @SerializedName("private")
    private boolean privateBuild;
    private Repository repository;
    private Branch branch;
    private String tag;
    private Commit commit;
    private Job[] jobs;
    private Stage[] stages;
    @SerializedName("created_by")
    private Owner createdBy;
    @SerializedName("updated_at")
    private String updatedAt;

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public int getDuration() {
        return duration;
    }

    public String getEventType() {
        return eventType;
    }

    public String getPreviousState() {
        return previousState;
    }

    public String getPullRequestTitle() {
        return pullRequestTitle;
    }

    public int getPullRequestNumber() {
        return pullRequestNumber;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinished_at() {
        return finished_at;
    }

    public boolean isPrivateBuild() {
        return privateBuild;
    }

    public Repository getRepository() {
        return repository;
    }

    public Branch getBranch() {
        return branch;
    }

    public String getTag() {
        return tag;
    }

    public Commit getCommit() {
        return commit;
    }

    public Job[] getJobs() {
        return jobs;
    }

    public Stage[] getStages() {
        return stages;
    }

    public Owner getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
