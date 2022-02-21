package com.leprechau.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechau.com.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
