package com.expenso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Article {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("subtitle")
	private String subtitle;
	
	@JsonProperty("post")
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
		return "Article [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", post=" + post + "]";
	}
	
	
}
