package com.sample.springboot.service;

import com.sample.springboot.dto.BalanceDTO;
import com.sample.springboot.repository.AccountRepository;
import com.sample.springboot.repository.BalanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BalanceService {

    private AccountRepository accountRepository;
    private BalanceRepository balanceRepository;

    public BalanceDTO getAccountData(String accountNumber) {
        var account = accountRepository.getAccountData(accountNumber);
        var balance = balanceRepository.getBalanceByAccountNumber(accountNumber);
        return BalanceDTO.builder()
                .accountNumber(account.getAccountNumber())
                .customerName(account.getCustomerName())
                .balance(balance)
                .build();

    }

}
