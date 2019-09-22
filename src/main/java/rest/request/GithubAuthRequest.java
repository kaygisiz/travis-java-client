package rest.request;

public class GithubAuthRequest {
    private String[] scopes;
    private String note;

    public GithubAuthRequest() {
    }

    public GithubAuthRequest(String note, String... scopes) {
        this.scopes = scopes;
        this.note = note;
    }

    public String[] getScopes() {
        return scopes;
    }

    public void setScopes(String[] scopes) {
        this.scopes = scopes;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
