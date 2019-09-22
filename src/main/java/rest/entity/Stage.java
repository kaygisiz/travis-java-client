package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Stage {
    private int id;
    private int number;
    private String name;
    private String state;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("finished_at")
    private String finishedAt;
    private Job[] jobs;

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
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

    public Job[] getJobs() {
        return jobs;
    }
}
