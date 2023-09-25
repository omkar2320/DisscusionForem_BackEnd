package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postId;
	private String topic;
	private String content ;
	private String comment;
	

	
	
//	@ManyToOne
//	@JoinColumn(name="userid",nullable=false)
//	private User user;
	
	
	public Post() {
		super();
	}

	public Post(int postId, String content,String topic,String comment) {
		super();
		this.postId = postId;
		this.content = content;
		this.topic=topic;
		this.comment=comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	

	
	
	
	
}
