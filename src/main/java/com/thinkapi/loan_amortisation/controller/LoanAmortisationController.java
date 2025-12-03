package com.thinkapi.loan_amortisation.controller;

import com.thinkapi.loan_amortisation.model.loan_amortisation.ImproveLoanResponse;
import com.thinkapi.loan_amortisation.service.LoanAmortisationImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/amortization")
public class LoanAmortisationController {

    @Autowired
    private LoanAmortisationImprovementService service;

    @GetMapping("/loanAmortizationImprovement/{customerId}")
    public ResponseEntity<ImproveLoanResponse> improveLoan(@PathVariable int customerId) {
        return ResponseEntity.ok(service.process(customerId));
    }
}