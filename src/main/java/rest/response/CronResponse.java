package rest.response;

import rest.entity.Cron;

public class CronResponse extends BaseResponse {
    private Cron cron;

    public Cron getCron() {
        return cron;
    }

    public void setCron(Cron cron) {
        this.cron = cron;
    }
}
