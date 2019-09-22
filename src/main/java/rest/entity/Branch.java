package rest.entity;

import com.google.gson.annotations.SerializedName;
import rest.response.BaseResponse;

public class Branch extends BaseResponse {
    private String name;
    private Repository repository;
    @SerializedName("default_branch")
    private boolean defaultBranch;
    @SerializedName("exists_on_github")
    private boolean existsOnGithub;
    @SerializedName("last_build")
    private Build lastBuild;

    public String getName() {
        return name;
    }

    public Repository getRepository() {
        return repository;
    }

    public boolean isDefaultBranch() {
        return defaultBranch;
    }

    public boolean isExistsOnGithub() {
        return existsOnGithub;
    }

    public Build getLastBuild() {
        return lastBuild;
    }
}
