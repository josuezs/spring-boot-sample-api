package com.sample.springboot.repository;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class simulates a database access.
 */
@Component
public class BalanceRepository {

    public BigDecimal getBalanceByAccountNumber(String accountNumber) {
        var balance = ThreadLocalRandom.current().nextInt(0, 101);
        return new BigDecimal(balance);
    }

}
