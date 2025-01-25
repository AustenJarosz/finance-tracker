package com.example.financetracker.transaction;

import java.time.LocalDate;

public class Transaction {
    private Integer transactionId;
    private String merchant;
    private Integer amount;
    private LocalDate date;

    public Transaction(){

    }

    public Transaction(Integer transactionId, String merchant, Integer amount, LocalDate date) {
        this.transactionId = transactionId;
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
    }

    public Transaction(String merchant, Integer amount, LocalDate date) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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

