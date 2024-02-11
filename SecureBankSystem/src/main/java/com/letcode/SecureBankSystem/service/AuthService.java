package com.letcode.SecureBankSystem.service;

import com.letcode.SecureBankSystem.auth.AuthenticationResponse;
import com.letcode.SecureBankSystem.auth.CreateLoginRequest;
import com.letcode.SecureBankSystem.auth.CreateSignupRequest;

public interface AuthService {

    void signup(CreateSignupRequest createSignupRequest);

    AuthenticationResponse login(CreateLoginRequest createLoginRequest);

    void logout(String logoutResponse);
}
