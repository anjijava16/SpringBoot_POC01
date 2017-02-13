package com.iwinner.springboot.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwinner.springboot.blog.entities.Comment;

/**
 * @author Siva
 * 
 */
public interface CommentRepository extends JpaRepository<Comment, Integer>
{

}
