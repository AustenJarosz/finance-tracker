package com.example.financetracker.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Class that works with the JPA
//This interface is responsible for data access
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
