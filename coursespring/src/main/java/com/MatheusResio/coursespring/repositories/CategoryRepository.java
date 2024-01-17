package com.MatheusResio.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MatheusResio.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
}
