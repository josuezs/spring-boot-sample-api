package com.sample.springboot.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountEntity {

    private String accountNumber;
    private String customerName;

}
