package rest.response;

import rest.entity.Authentication;

public class AuthenticationResponse extends BaseResponse {
    private Authentication authentication;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }
}
