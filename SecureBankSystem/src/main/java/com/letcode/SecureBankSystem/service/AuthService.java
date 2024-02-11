package com.letcode.SecureBankSystem.service;

import com.letcode.SecureBankSystem.auth.AuthenticationResponse;
import com.letcode.SecureBankSystem.auth.CreateLoginRequest;
import com.letcode.SecureBankSystem.auth.CreateSignupRequest;
import com.letcode.SecureBankSystem.auth.LogoutResponse;

public interface AuthService {

    void signup(CreateSignupRequest createSignupRequest);

    AuthenticationResponse login(CreateLoginRequest createLoginRequest);

    void logout(LogoutResponse logoutResponse);
}
