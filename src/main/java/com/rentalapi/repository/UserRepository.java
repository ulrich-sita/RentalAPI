package com.rentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentalapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
