package com.MatheusResio.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MatheusResio.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
}
