package rest.entity;

import rest.response.BaseResponse;

public class Builds extends BaseResponse {
    private Build[] builds;

    public Build[] getBuilds() {
        return builds;
    }

    public void setBuilds(Build[] builds) {
        this.builds = builds;
    }
}
