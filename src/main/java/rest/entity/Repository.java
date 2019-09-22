package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Repository {
    private int id;
    private String name;
    private String slug;
    private String description;
    @SerializedName("github_id")
    private int githubId;
    @SerializedName("github_language")
    private String githubLanguage;
    private boolean active;
    private	Boolean	Whether;
    private Owner owner;
    @SerializedName("default_branch")
    private Branch defaultBranch;
    private boolean starred;
    @SerializedName("managed_by")
    private boolean managedBy;
    @SerializedName("active_on_org")
    private boolean activeOnOrg;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public int getGithubId() {
        return githubId;
    }

    public String getGithubLanguage() {
        return githubLanguage;
    }

    public boolean isActive() {
        return active;
    }

    public Boolean getWhether() {
        return Whether;
    }

    public Owner getOwner() {
        return owner;
    }

    public Branch getDefaultBranch() {
        return defaultBranch;
    }

    public boolean isStarred() {
        return starred;
    }

    public boolean isManagedBy() {
        return managedBy;
    }

    public boolean isActiveOnOrg() {
        return activeOnOrg;
    }
}
