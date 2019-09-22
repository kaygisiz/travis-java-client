package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Job {
    private int id;
    // allow_failure	Unknown	The job's allow_failure.
    private String number;
    private String state;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("finished_at")
    private String finishedAt;
    private Build build;
    private String queue;
    private Repository repository;
    private Commit commit;
    private Owner owner;
    private Stage[] stage;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    private	boolean	Whether;
    private Object config;
    // log_complete	Unknown	The job's log_complete.


    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public Build getBuild() {
        return build;
    }

    public String getQueue() {
        return queue;
    }

    public Repository getRepository() {
        return repository;
    }

    public Commit getCommit() {
        return commit;
    }

    public Owner getOwner() {
        return owner;
    }

    public Stage[] getStage() {
        return stage;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public boolean isWhether() {
        return Whether;
    }

    public Object getConfig() {
        return config;
    }
}
