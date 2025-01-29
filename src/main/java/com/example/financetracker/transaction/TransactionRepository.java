package com.example.financetracker.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

//Class that works with the JPA
//This interface is responsible for data access
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Query("SELECT s FROM Transaction s WHERE s.merchant = ?1")
    Optional<Transaction> findTransactionByMerchant(String merchant);
}
