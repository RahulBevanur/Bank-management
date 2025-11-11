package com.project.bankmanagement.auth_user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = "first name is required")
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @NotBlank(message = "email is reqired")
    @Email
    private String Email;

    private List<String> roles;

    @NotBlank(message = "password is required")
    private String password;
}
