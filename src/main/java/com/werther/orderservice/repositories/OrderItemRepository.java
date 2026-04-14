package com.werther.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.werther.orderservice.entities.OrderItem;
import com.werther.orderservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
