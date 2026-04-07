package com.werther.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.werther.orderservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
