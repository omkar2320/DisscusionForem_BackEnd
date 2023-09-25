package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Comment;

public interface CommentRepository extends JpaRepository<Comment ,Integer>{
//	@Query("Insert into Comment c(c.content) where c.postId:postId")
//	public String addComment(int postId,String content);

}
