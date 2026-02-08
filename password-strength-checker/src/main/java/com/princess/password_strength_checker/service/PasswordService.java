package com.princess.password_strength_checker.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    public String checkPassword(String password) {

        if (password.length() < 8) {
            return "Password must be at least 8 characters long";
        }

        if (!password.matches(".*[A-Z].*")) {
            return "Password must contain an uppercase letter";
        }

        if (!password.matches(".*[a-z].*")) {
            return "Password must contain a lowercase letter";
        }

        if (!password.matches(".*\\d.*")) {
            return "Password must contain a number";
        }

        if (!password.matches(".*[@#$%!].*")) {
            return "Password must contain a special character (@ # $ % !)";
        }

        return "Password is STRONG ✅";
    }
}







