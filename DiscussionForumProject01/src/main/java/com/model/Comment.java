package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	private int commentId;
	private String content;
	private String userName;
	
	
	
//	@ManyToOne
//	@JoinColumn(name="userid",nullable=false)
//	private User user;
//	
//	@ManyToOne
//	@JoinColumn(name="postId",nullable=false)
//	private Post post;
//	
	public Comment() {
		super();
	}
	public Comment(int commentId, String content,String userName) {
		super();
		this.commentId = commentId;
		this.content = content;
		this.userName=userName;
		
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
}
