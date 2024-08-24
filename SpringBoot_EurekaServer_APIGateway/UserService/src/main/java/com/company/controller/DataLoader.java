package com.company.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.entities.User;
import com.company.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {
	
	@Autowired
	UserRepository repository;
	
	@PostConstruct
	public void createUsers() {
		
		List<User> list = Stream.of(new User(1,"Rahul","Mumbai"),new User(2,"Shivam","Pune"),new User(3,"Murari","Aurangabad")).toList();
		
		repository.saveAll(list);
		
	}

}
