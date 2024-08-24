package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entities.User;
import com.company.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/{userId}")
	ResponseEntity<User> getUserById(@PathVariable int userId) {
		User findUserById = service.findUserById(userId);
		return new ResponseEntity<>(findUserById,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<User>> getAllUserById() {
		List<User> findUserById = service.findAllUsers();
		return new ResponseEntity<>(findUserById,HttpStatus.OK);
	}

}
