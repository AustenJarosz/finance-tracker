package com.example.financetracker.transaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class TransactionConfig {

    @Bean
    CommandLineRunner runner(TransactionRepository transactionRepository) {
        return args -> {
            Transaction transactionOne = new Transaction(
                    "Costco",
                    1000.00,
                    LocalDate.of(2025, JANUARY, 1)
            );
            Transaction transactionTwo = new Transaction(
                    "Golfing",
                    105.25,
                    LocalDate.of(2024, DECEMBER, 16)
            );
            transactionRepository.saveAll(
                    List.of(transactionOne,transactionTwo)
            );
        };
    }
}
