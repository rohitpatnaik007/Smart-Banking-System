// Placeholder for repository/UserRepository.java

package com.zeta.user.repository;

import com.zeta.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}