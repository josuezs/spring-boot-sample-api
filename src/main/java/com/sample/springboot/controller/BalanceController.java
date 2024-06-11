package com.sample.springboot.controller;

import com.sample.springboot.dto.BalanceDTO;
import com.sample.springboot.service.BalanceService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class BalanceController {

    private BalanceService balanceService;

    @Operation(description = "Check account balance")
    @GetMapping(value = "/balance")
    public ResponseEntity<BalanceDTO> balance(@RequestParam String accountNumber) {
        return ResponseEntity.ok(balanceService.getAccountData(accountNumber));
    }

}
