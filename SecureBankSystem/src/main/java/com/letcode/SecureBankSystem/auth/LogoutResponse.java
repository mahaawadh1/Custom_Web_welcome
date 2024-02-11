package com.letcode.SecureBankSystem.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LogoutResponse {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
