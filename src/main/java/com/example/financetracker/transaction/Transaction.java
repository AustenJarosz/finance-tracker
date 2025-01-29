package com.example.financetracker.transaction;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Transaction {
    @Id
    @SequenceGenerator(
            name = "transaction_sequence",
            sequenceName = "transaction_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_sequence"
    )
    private Integer transactionId;
    private String merchant;
    private Double amount;
    private LocalDate date;

    public Transaction(){
    }

    public Transaction(Integer transactionId, String merchant, Double amount, LocalDate date) {
        this.transactionId = transactionId;
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
    }

    public Transaction(String merchant, Double amount, LocalDate date) {
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "transactionId=" + transactionId +
                ", merchant='" + merchant + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}

