package com.iwinner.springboot.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwinner.springboot.blog.entities.User;

/**
 * @author Siva
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);

	User findByEmailAndPassword(String email, String password);

}
