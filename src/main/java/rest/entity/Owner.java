package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Owner {
    private int id;
    private String login;
    private String name;
    @SerializedName("github_id")
    private int githubId;
    @SerializedName("avatar_url")
    private String avatarUrl;
    private boolean education;
    // allow_migration	Unknown	The owner's allow_migration.


    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getGithubId() {
        return githubId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public boolean isEducation() {
        return education;
    }
}
