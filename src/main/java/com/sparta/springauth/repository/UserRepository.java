package com.sparta.springauth.repository;

import com.sparta.springauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // username 중복확인
    Optional<User> findByUsername(String username);
    // email 중복확인
    Optional<User> findByEmail(String email);
}
