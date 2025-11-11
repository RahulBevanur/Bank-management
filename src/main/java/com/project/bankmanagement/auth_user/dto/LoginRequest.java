package com.project.bankmanagement.auth_user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LoginRequest {

    @NotBlank(message = "email is reqired")
    @Email
    private String Email;

    @NotBlank(message = "password is required")
    private String password;
}
