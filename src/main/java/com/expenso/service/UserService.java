package com.expenso.service;

import org.springframework.http.ResponseEntity;

import com.expenso.model.User;

import net.minidev.json.JSONObject;

public interface UserService {
	public ResponseEntity<?> saveUser(User user);
	public ResponseEntity<?> loginUser(User user);
}
