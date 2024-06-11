package com.sample.springboot.repository;

import com.sample.springboot.domain.AccountEntity;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class simulates a database access.
 */
@Component
public class AccountRepository {

    private static final String[] INVESTOR_NAMES = {"Warren Buffett", "Peter Lynch", "Benjamin Graham", "Charlie Munger",
            "George Soros", "John Paulson", "Carl Icahn", "Ray Dalio", "David Tepper", "Bill Ackman"};

    public AccountEntity getAccountData(String accountNumber) {
        var index = ThreadLocalRandom.current().nextInt(0, INVESTOR_NAMES.length);
        var name = INVESTOR_NAMES[index];
        return AccountEntity.builder()
                .customerName(name)
                .accountNumber(accountNumber)
                .build();
    }

}
