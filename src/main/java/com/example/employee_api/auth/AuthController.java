package com.example.employee_api.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @GetMapping("/hello")
    public String hello() {
        return "Public API - no need login";
    }
    @PostMapping("/login")
    public  String login(){
        return "Dang nhap thanh cong";
    }
}