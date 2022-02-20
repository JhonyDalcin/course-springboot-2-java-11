package com.leprechau.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechau.com.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
