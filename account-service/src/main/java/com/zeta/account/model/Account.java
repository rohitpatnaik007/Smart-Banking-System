// Placeholder for model/Account.java// Account Entity
package com.zeta.account.model;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Double balance;
    // getters and setters
}