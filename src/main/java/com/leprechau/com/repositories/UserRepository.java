package com.leprechau.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechau.com.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
