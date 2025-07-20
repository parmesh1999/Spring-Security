package com.parmesh.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.parmesh.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find a user by their username
    Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String username);
}