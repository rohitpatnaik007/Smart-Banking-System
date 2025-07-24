// Placeholder for controller/TransactionController.java
// TransactionController
package com.zeta.transaction.controller;

import com.zeta.transaction.model.Transaction;
import com.zeta.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/transfer")
    public Transaction transfer(@RequestBody Transaction transaction) {
        transaction.setTimestamp(LocalDateTime.now());
        // NOTE: In real world, you'd invoke AccountService to debit/credit accounts
        return transactionRepository.save(transaction);
    }

    @GetMapping("/history/{userId}")
    public List<Transaction> getHistory(@PathVariable Long userId) {
        return transactionRepository.findByFromUserIdOrToUserId(userId, userId);
    }
}
