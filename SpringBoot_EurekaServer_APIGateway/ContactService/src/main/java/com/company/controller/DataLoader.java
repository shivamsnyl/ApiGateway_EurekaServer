package com.company.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.entities.Contact;
import com.company.repository.ContactRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {
	
	@Autowired
	ContactRepository repository;
	
	@PostConstruct
	public void addData() {
		
		List<Contact> list = Stream.of(new Contact(1,123,"abs@gmail.com",1),new Contact(2,123,"abs@gmail.com",1),
				new Contact(3,123,"abs@gmail.com",2),new Contact(4,123,"abs@gmail.com",2),
				new Contact(5,123,"abs@gmail.com",3)).toList();
		
		repository.saveAll(list);
	}

}
