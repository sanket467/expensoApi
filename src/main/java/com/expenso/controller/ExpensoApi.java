package com.expenso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expenso.model.Article;
import com.expenso.model.User;

@RequestMapping("/")
public interface ExpensoApi {
	
	@PostMapping(value = "/addUser",produces = "application/json;charset=UTF-8" , consumes = 
			"application/json;charset=UTF-8")
	@CrossOrigin
	ResponseEntity<?> addUser(@RequestBody User user);
	
	@GetMapping(value = "/loginUser",produces = "application/json;charset=UTF-8" , consumes = 
			"application/json;charset=UTF-8")
	@CrossOrigin
	ResponseEntity<?> loginUser(@RequestBody User user);
	
	@PostMapping(value ="/article",produces = "application/json;charset=UTF-8" , consumes = 
			"application/json;charset=UTF-8")
	@CrossOrigin
	ResponseEntity<?> postArticle(@RequestBody Article article);
	
	@GetMapping(value ="/article",produces = "application/json;charset=UTF-8" , consumes = 
			"application/json;charset=UTF-8")
	@CrossOrigin
	ResponseEntity<?> getArticle(@RequestBody User user);
}
