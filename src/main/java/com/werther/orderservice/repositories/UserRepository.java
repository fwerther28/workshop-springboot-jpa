package com.werther.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.werther.orderservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
