package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Authentication {
    @SerializedName("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }
}
