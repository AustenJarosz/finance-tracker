package com.example.financetracker.transaction;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //sends transactionService to controller as a "bean"
public class TransactionService {

    @GetMapping
    public List<Transaction> getTransactions() {
        return List.of(
                new Transaction(
                        1,
                        "costco",
                        1000,
                        LocalDate.of(2025, Month.JANUARY, 1)
                )
        );

    }
}
