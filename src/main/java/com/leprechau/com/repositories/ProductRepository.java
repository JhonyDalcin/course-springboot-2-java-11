package com.leprechau.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechau.com.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
