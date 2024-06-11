package com.sample.springboot.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BalanceDTO {

    private String accountNumber;
    private String customerName;
    private BigDecimal balance;

}
