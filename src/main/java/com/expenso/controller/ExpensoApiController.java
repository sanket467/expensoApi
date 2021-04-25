package com.expenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.expenso.model.User;
import com.expenso.repository.UserRepository;
import com.expenso.service.UserService;

@Controller
public class ExpensoApiController implements ExpensoApi {
	
	@Autowired
	UserService userService;
	
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

}
