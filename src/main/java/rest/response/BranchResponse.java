package rest.response;

import rest.entity.Branch;

public class BranchResponse extends BaseResponse {
    private Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
