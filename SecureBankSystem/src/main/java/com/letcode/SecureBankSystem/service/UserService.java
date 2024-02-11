package com.letcode.SecureBankSystem.service;

import com.letcode.SecureBankSystem.Controller.CreateContactRequest;
import com.letcode.SecureBankSystem.Controller.CreateUserRequest;
import com.letcode.SecureBankSystem.UpdateUserStatusRequest;
import com.letcode.SecureBankSystem.entity.UserEntity;

import java.util.List;


public interface UserService {

    void saveUser(CreateContactRequest createUserRequest);

    void saveUser(CreateUserRequest createUserRequest);

    void updateUserStatus(Long userID, UpdateUserStatusRequest updateUserStatusRequest);


    List<UserEntity> getAllUsers();

}
