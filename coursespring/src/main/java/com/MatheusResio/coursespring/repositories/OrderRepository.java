package com.MatheusResio.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MatheusResio.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
