package com.project.bankmanagement.account.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.bankmanagement.auth_user.dto.UserDTO;
import com.project.bankmanagement.enums.AccountStatus;
import com.project.bankmanagement.enums.AccountType;
import com.project.bankmanagement.enums.Currency;
import com.project.bankmanagement.transaction.dto.TransactionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Long id;

    private String accountNumber;

    private BigDecimal balance;

    private AccountType accountType;

    @JsonBackReference// this will not be added to the account dto. It will be ignored because it is a back refrence
    private UserDTO user;

    private Currency currency;

    private AccountStatus status;

    @JsonManagedReference// if helps avoid recursion loop by ignoring the AccountDTO withing the TransactionDTO
    private List<TransactionDTO> transactions;

    private LocalDateTime closedAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
