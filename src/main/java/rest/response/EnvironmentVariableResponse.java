package rest.response;

import rest.entity.EnvironmentVariable;

public class EnvironmentVariableResponse extends BaseResponse {
    private EnvironmentVariable environmentVariable;

    public EnvironmentVariable getEnvironmentVariable() {
        return environmentVariable;
    }

    public void setEnvironmentVariable(EnvironmentVariable environmentVariable) {
        this.environmentVariable = environmentVariable;
    }
}
