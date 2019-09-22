package rest.request;

import com.google.gson.annotations.SerializedName;

public class EnvironmentVariableRequest {
    @SerializedName("env_var.value")
    private String value;
    @SerializedName("env_var.public")
    private boolean publicEnv;

    public String getValue() {
        return value;
    }

    public boolean isPublicEnv() {
        return publicEnv;
    }
}
