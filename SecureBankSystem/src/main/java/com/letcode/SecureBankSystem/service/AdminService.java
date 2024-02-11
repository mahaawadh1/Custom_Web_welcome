package com.letcode.SecureBankSystem.service;

import com.letcode.SecureBankSystem.entity.UserEntity;

import java.util.List;

public interface AdminService {
    List<UserEntity> getAllUsers();
}
