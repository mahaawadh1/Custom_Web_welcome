package com.letcode.SecureBankSystem.Controller;
import com.letcode.SecureBankSystem.auth.AuthenticationResponse;
import com.letcode.SecureBankSystem.auth.CreateLoginRequest;
import com.letcode.SecureBankSystem.auth.CreateSignupRequest;
import com.letcode.SecureBankSystem.auth.LogoutResponse;
import com.letcode.SecureBankSystem.service.AuthService;
import com.letcode.SecureBankSystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> createUser(@RequestBody CreateSignupRequest createSignupRequest){
        authService.signup(createSignupRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User Created");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody CreateLoginRequest createLoginRequest){
        AuthenticationResponse response=authService.login(createLoginRequest);
        HttpStatus status= HttpStatus.OK;
        if (response == null){
            status= HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<>(response, status);
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogoutResponse logoutResponse){
        authService.logout(String.valueOf(logoutResponse));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
