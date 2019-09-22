package rest.request;

public class AuthenticationRequest {
    private String github_token;

    public AuthenticationRequest(String github_token) {
        this.github_token = github_token;
    }

    public String getGithub_token() {
        return github_token;
    }

    public void setGithub_token(String github_token) {
        this.github_token = github_token;
    }
}
