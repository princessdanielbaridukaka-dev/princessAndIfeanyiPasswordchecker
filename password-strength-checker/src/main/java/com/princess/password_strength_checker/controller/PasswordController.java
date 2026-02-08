package com.princess.password_strength_checker.controller;

import com.princess.password_strength_checker.service.PasswordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/")
    public String showForm() {
        return "password";
    }

    @PostMapping("/check")
    public String checkPassword(
            @RequestParam String password,
            Model model) {

        String result = passwordService.checkPassword(password);
        model.addAttribute("result", result);
        return "password";
    }
}

