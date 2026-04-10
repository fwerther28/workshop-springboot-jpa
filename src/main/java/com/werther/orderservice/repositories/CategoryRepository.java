package com.werther.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.werther.orderservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

