package com.expenso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.expenso.entity.ArticleEntity;
import com.expenso.model.Article;
import com.expenso.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepo;

	@Override
	public ResponseEntity<?> saveArticle(Article article) {
		
		ArticleEntity articleEnt = new ArticleEntity();
		articleEnt.setTitle(article.getTitle());
		articleEnt.setSubtitle(article.getSubtitle());
		articleEnt.setPost(article.getPost());
		return new ResponseEntity<>(articleRepo.save(articleEnt), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getArticle() {
		List<ArticleEntity> articles = articleRepo.findAll();
		return new ResponseEntity<>(articles, HttpStatus.OK);
	}

}
