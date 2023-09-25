package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CommentRepository;
import com.dao.PostRepository;
import com.dao.UserRepository;
import com.model.Post;
import com.model.User;
@Service
public class UserServiceImp implements UserServiceInterface {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PostRepository postRepo;
	
//	@Autowired
//	CommentRepository commentRepo;
	
	
	public User addUser(User user) {

		return userRepo.save(user);
	}

	public User findByEmailIdAndPassword(String email, String password) {

		return userRepo.findByEmailIdAndPassword(email, password);
	}

	public User getUserByEmail(String email) {

		return userRepo.findUserByEmail(email);
	}

	public User getUserById(int userId) {

		return userRepo.findById(userId).get();
	}
	
	

	@Override
	public Post addPost(Post post) {
		
		return postRepo.save(post);
	}

	@Override
	public Post getOnePost(int postId) {
		
		return postRepo.findById(null).orElse(null);
	}

	

	@Override
	public List<Post> getOneTopic(String topic) {
		
		return postRepo.findByTopic(topic);
	}

	@Override
	public List<Post> getAllPost() {
		return postRepo.findAll();
	}

	@Override
	public Post addComment(Post comment) {
		
		return postRepo.save(comment);
	}

	@Override
	public List<Post> getOneComment(String comment) {
		
		return postRepo.findByTopic(comment);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public Comment addComment(Comment comment) {
//		
//		return commentRepo.save(comment);
//	}
//
//	@Override
//	public Comment getOneComment(String CommentId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String addComment(int postId,String content) {
//		// TODO Auto-generated method stub
//		return commentRepo.addComment(postId,content);
//	}
//

//	public Comment getOneComment(String commentId) {
//		
//		return commentRepo.findByComment(commentId);
//	}

	
	

}
