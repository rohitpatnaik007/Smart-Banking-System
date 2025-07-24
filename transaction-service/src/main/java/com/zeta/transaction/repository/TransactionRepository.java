// Placeholder for repository/TransactionRepository.java
package com.zeta.transaction.repository;

import com.zeta.transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByFromUserIdOrToUserId(Long fromUserId, Long toUserId);
}