package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String username);

	public User findByRole(Role role);
}
