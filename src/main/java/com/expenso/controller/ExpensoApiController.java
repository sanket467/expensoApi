package com.expenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.expenso.model.Article;
import com.expenso.model.User;
import com.expenso.repository.UserRepository;
import com.expenso.service.ArticleService;
import com.expenso.service.UserService;

@Controller
public class ExpensoApiController implements ExpensoApi {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ArticleService articleService;
	
	@Override
	public ResponseEntity<?> addUser(User user) {
		System.out.println("Inside addUser");
		return userService.saveUser(user);
	}

	@Override
	public ResponseEntity<?> loginUser(User user) {
		System.out.println("Inside loginUser");
		return userService.loginUser(user);
	}
	
	@Override
	public ResponseEntity<?> postArticle(Article article) {
		return articleService.saveArticle(article);
	}

	@Override
	public ResponseEntity<?> getArticle(@RequestBody User user) {
		return articleService.getArticle();
	}

}
