package rest.entity;

import rest.response.BaseResponse;

public class Crons extends BaseResponse {
    private Cron[] crons;

    public Cron[] getCrons() {
        return crons;
    }

    public void setCrons(Cron[] crons) {
        this.crons = crons;
    }
}
