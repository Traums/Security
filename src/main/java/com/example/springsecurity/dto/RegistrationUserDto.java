package com.example.springsecurity.dto;

import lombok.Data;

@Data
public class RegistrationUserDto {
    private String username;
    private String password;
    private String confirmedPassword;
    private String email;
}
