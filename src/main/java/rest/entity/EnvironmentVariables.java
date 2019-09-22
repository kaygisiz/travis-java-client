package rest.entity;

import rest.response.BaseResponse;

public class EnvironmentVariables extends BaseResponse {
    private EnvironmentVariable[] environmentVariables;

    public EnvironmentVariable[] getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(EnvironmentVariable[] environmentVariables) {
        this.environmentVariables = environmentVariables;
    }
}
