// Placeholder for model/Transaction.java
// Transaction Entity
package com.zeta.transaction.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long fromUserId;
    private Long toUserId;
    private Double amount;
    private LocalDateTime timestamp;
    // getters and setters
}