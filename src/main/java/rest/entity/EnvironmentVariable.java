package rest.entity;

import com.google.gson.annotations.SerializedName;
import rest.response.BaseResponse;

public class EnvironmentVariable extends BaseResponse {
    private String id;
    private String name;
    private String value;
    @SerializedName("public")
    private boolean publicEnv;
    // branch	Unknown	The env_var's branch.

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public boolean isPublicEnv() {
        return publicEnv;
    }
}
