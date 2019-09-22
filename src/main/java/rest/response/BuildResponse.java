package rest.response;

import rest.entity.Build;

public class BuildResponse extends BaseResponse {
    private Build build;

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }
}
