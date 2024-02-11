package com.letcode.SecureBankSystem.Controller;
import com.letcode.SecureBankSystem.entity.UserEntity;
import com.letcode.SecureBankSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api/v1/admin-dashboard/")
public class AdminController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
}