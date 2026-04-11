package com.werther.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.werther.orderservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

