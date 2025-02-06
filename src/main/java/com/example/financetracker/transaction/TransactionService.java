package com.example.financetracker.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Optional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //sends transactionService to controller as a "bean"
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public void addNewTransaction(Transaction transaction) {
        Optional<Transaction> transactionByMerchant = transactionRepository
                .findTransactionByMerchant(transaction.getMerchant());
//        if(transactionByMerchant.isPresent()) {
//            throw new IllegalStateException("Transaction from that merchant does not exist");
//        }
        transactionRepository.save(transaction);
        System.out.println(transaction);
    }

    public void deleteTransaction(Integer id) {
        boolean exists = transactionRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "Transaction with id " + id + " does not exist"
            );
        }
        transactionRepository.deleteById(id);
    }

    @Transactional
    public void updateTransaction(Integer id, String merchant, Integer amount, Date date) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Transaction with id " + id + " does not exist")
                );
    }
}
