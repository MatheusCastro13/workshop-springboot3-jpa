package com.MatheusResio.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MatheusResio.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
