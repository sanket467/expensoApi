package com.expenso.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "article")
public class ArticleEntity {
	
	@Id
	private String id;
	
	private String title;
	
	private String subtitle;
	
	private String post;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "ArticleEntity [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", post=" + post + "]";
	}
	
	
}
