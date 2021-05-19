package com.expenso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.expenso.entity.UserEntity;
import com.expenso.model.User;
import com.expenso.repository.UserRepository;

import net.minidev.json.JSONObject;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public ResponseEntity<?> saveUser(User user) {
		UserEntity newUser = new UserEntity();
		
		newUser.setUname(user.getUname());
		newUser.setPassword(user.getPassword());
		newUser.setFirst_name(user.getFname());
		newUser.setLast_name(user.getLname());
		newUser.setEmail(user.getEmail());
		newUser.setContact(user.getContact());
		
		return new ResponseEntity<>(userRepository.save(newUser), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> loginUser(User user) {
		JSONObject result = new JSONObject();
		
		UserEntity savedUser = userRepository.findByUname(user.getUname());
		
		if(StringUtils.isEmpty(savedUser)) {
			result.put("message", "EXCEPTION");
			result.put("description", "USER DOES NOT EXIST");
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		
		if(!user.getPassword().equals(savedUser.getPassword())) {
			result.put("message", "EXCEPTION");
			result.put("description", "PASSWORD DOES NOT MATCH");
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		
		result.put("user", savedUser);
		result.put("message", "SUCCESS");
		result.put("description", "LOGGED IN");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
