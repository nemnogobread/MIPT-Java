package com.example.CRUD2.repository;

import com.example.CRUD2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
