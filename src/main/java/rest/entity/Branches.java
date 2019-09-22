package rest.entity;

import rest.response.BaseResponse;

public class Branches extends BaseResponse {
    private Branch[] branches;

    public Branch[] getBranches() {
        return branches;
    }

    public void setBranches(Branch[] branches) {
        this.branches = branches;
    }
}
