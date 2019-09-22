package rest.definition;

public enum  CronInterval {
    DAILY("daily"),
    WEEKLY("weekly"),
    MONTHLY("monthly");

    private String interval;

    CronInterval(String interval) {
        this.interval = interval;
    }

    public String getInterval() {
        return interval;
    }
}
