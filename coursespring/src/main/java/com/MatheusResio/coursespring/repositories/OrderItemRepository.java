package com.MatheusResio.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MatheusResio.coursespring.entities.OrderItem;
import com.MatheusResio.coursespring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	
}
