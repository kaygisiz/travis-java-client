package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Commit {
    private int id;
    private String sha;
    private String ref;
    private String message;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("committed_at")
    private String committedAt;
    private Object committer;
    private Object author;

    public int getId() {
        return id;
    }

    public String getSha() {
        return sha;
    }

    public String getRef() {
        return ref;
    }

    public String getMessage() {
        return message;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getCommittedAt() {
        return committedAt;
    }

    public Object getCommitter() {
        return committer;
    }

    public Object getAuthor() {
        return author;
    }
}
