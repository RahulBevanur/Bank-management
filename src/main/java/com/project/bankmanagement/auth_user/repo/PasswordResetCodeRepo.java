package com.project.bankmanagement.auth_user.repo;

import com.project.bankmanagement.auth_user.entity.PasswordResetCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordResetCodeRepo, Long> {
    Optional<PasswordResetCode> fingByCode(String code);
    void deleteByUserID(Long userId);
}
