package com.example.financetracker.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionService.getTransactions();
    }

    @PostMapping
    public void registerNewTransaction(@RequestBody Transaction transaction) {
        transactionService.addNewTransaction(transaction);
    }

    @DeleteMapping(path = "{transactionId}")
    public void deleteTransaction(@PathVariable ("transactionId") Integer id) {
        transactionService.deleteTransaction(id);
    }

    @PutMapping (path = "{transactionId}")
    public void updateTransaction(
            @PathVariable ("transactionId") Integer id,
            @RequestParam(required = false) String merchant,
            @RequestParam(required = false) Integer amount,
            @RequestParam(required = false) Date date){
        transactionService.updateTransaction(id, merchant, amount, date);
    }
}


