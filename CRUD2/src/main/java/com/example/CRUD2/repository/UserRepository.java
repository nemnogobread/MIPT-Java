package com.example.CRUD2.repository;

import com.example.CRUD2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT * FROM User WHERE lastname = ?1")
    List<User> findByLastName(String lastName);
}
