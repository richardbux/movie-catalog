package com.richhunt.microservices.movieratingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richhunt.microservices.movieratingservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
