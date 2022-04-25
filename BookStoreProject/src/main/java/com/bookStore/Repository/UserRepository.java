package com.bookStore.Repository;


import com.bookStore.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    }

