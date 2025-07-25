// Placeholder for repository/AccountRepository.java// AccountRepository
package com.zeta.account.repository;

import com.zeta.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUserId(Long userId);
}