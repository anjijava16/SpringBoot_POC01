package com.iwinner.springboot.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwinner.springboot.blog.entities.Post;

/**
 * @author Siva
 * 
 */
public interface PostRepository extends JpaRepository<Post, Integer>
{

}
