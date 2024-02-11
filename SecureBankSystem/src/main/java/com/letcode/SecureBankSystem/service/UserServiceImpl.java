package com.letcode.SecureBankSystem.service;
import com.letcode.SecureBankSystem.Controller.CreateContactRequest;
import com.letcode.SecureBankSystem.Controller.CreateUserRequest;
import com.letcode.SecureBankSystem.Controller.enums.Status;
import com.letcode.SecureBankSystem.UpdateUserStatusRequest;
import com.letcode.SecureBankSystem.auth.AuthenticationResponse;
import com.letcode.SecureBankSystem.auth.CreateLoginRequest;
import com.letcode.SecureBankSystem.auth.CreateSignupRequest;
import com.letcode.SecureBankSystem.auth.LogoutResponse;
import com.letcode.SecureBankSystem.bo.customUserDetails.CustomUserDetails;
import com.letcode.SecureBankSystem.config.JWTUtil;
import com.letcode.SecureBankSystem.entity.RoleEntity;
import com.letcode.SecureBankSystem.entity.UserEntity;
import com.letcode.SecureBankSystem.exception.BodyGuardException;
import com.letcode.SecureBankSystem.exception.UserNotFoundException;
import com.letcode.SecureBankSystem.reposetry.RoleRepository;
import com.letcode.SecureBankSystem.reposetry.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(CreateContactRequest createUserRequest) {
        UserEntity userEntity= new UserEntity();
        userEntity.setName(createUserRequest.getName());
        userEntity.setEmail(createUserRequest.getEmail());
        userEntity.setPhoneNumber(createUserRequest.getPhone());
        userEntity.setStatus(Status.valueOf(createUserRequest.getStatus()));
        userRepository.save(userEntity);

    }

    @Override
    public void saveUser(CreateUserRequest createUserRequest) {

    }


    @Override
    public void updateUserStatus(Long userID, UpdateUserStatusRequest updateUserStatusRequest) {
        UserEntity userEntity=userRepository.findById(userID)
                .orElseThrow();
        if(!updateUserStatusRequest.getStatus().equals("ACTIVE") && !updateUserStatusRequest.getStatus().equals("INACTIVE")){
            throw new IllegalArgumentException("The status should be ACTIVE or INACTIVE");
        }
        userEntity.setStatus(Status.valueOf(updateUserStatusRequest.getStatus()));
        userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return null;
    }
}
