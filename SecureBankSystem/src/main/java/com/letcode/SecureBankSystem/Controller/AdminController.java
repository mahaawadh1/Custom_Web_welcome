package com.letcode.SecureBankSystem.Controller;
import com.letcode.SecureBankSystem.auth.AuthenticationResponse;
import com.letcode.SecureBankSystem.auth.CreateLoginRequest;
import com.letcode.SecureBankSystem.auth.LogoutResponse;
import com.letcode.SecureBankSystem.entity.UserEntity;
import com.letcode.SecureBankSystem.service.AdminService;
import com.letcode.SecureBankSystem.service.AuthService;
import com.letcode.SecureBankSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final AdminService adminService;



    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    // GET endpoint to retrieve all Users
    @GetMapping("/get_user")
    public List<UserEntity> getAllUsers() {
        return adminService.getAllUsers();
    }




}
