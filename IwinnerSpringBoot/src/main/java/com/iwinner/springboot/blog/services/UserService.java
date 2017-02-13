/**
 * 
 */
package com.iwinner.springboot.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwinner.springboot.blog.entities.User;
import com.iwinner.springboot.blog.repositories.UserRepository;

/**
 * @author Raju
 *
 */
@Service
@Transactional
public class UserService 
{
	
	@Autowired UserRepository userRepository;
	
	public User login(String email, String password)
	{
		return userRepository.findByEmailAndPassword(email, password);
	}
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
}
