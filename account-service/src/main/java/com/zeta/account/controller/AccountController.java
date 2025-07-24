// Placeholder for controller/AccountController.java
// AccountController
package com.zeta.account.controller;

import com.zeta.account.model.Account;
import com.zeta.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping("/user/{userId}")
    public Account getAccountByUserId(@PathVariable Long userId) {
        return accountRepository.findByUserId(userId).orElseThrow();
    }

    @PutMapping("/deposit/{userId}/{amount}")
    public Account deposit(@PathVariable Long userId, @PathVariable Double amount) {
        Account acc = accountRepository.findByUserId(userId).orElseThrow();
        acc.setBalance(acc.getBalance() + amount);
        return accountRepository.save(acc);
    }

    @PutMapping("/withdraw/{userId}/{amount}")
    public Account withdraw(@PathVariable Long userId, @PathVariable Double amount) {
        Account acc = accountRepository.findByUserId(userId).orElseThrow();
        if (acc.getBalance() < amount) throw new RuntimeException("Insufficient balance");
        acc.setBalance(acc.getBalance() - amount);
        return accountRepository.save(acc);
    }
}