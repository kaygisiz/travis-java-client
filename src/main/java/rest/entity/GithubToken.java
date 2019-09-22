package rest.entity;

public class GithubToken {
    private String id;
    private String url;
    private String token;
    private String note;
    private String[] scopes;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getToken() {
        return token;
    }

    public String getNote() {
        return note;
    }

    public String[] getScopes() {
        return scopes;
    }
}
