package com.sample.springboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class BalanceController {

    @Operation(description = "Check account balance")
    @GetMapping(value = "/balance")
    public ResponseEntity balance(@RequestParam(required = false) String accountNumber) {
        var balance = ThreadLocalRandom.current().nextInt(0, 101);
        return ResponseEntity.ok("{ \"accountNumber\": " + accountNumber + ", \"balance\": " + balance + " }");
    }

}
