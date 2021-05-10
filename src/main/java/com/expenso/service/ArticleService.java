package com.expenso.service;

import org.springframework.http.ResponseEntity;
import com.expenso.model.Article;

public interface ArticleService {
	public ResponseEntity<?> saveArticle(Article article);
	public ResponseEntity<?> getArticle();
}
