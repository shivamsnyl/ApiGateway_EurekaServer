package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entities.Contact;
import com.company.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService service;
	
	@GetMapping("/{userId}")
	ResponseEntity<List<Contact>> getContactByUserId(@PathVariable int userId){
		List<Contact> findByUserId = service.findByUserId(userId);
		return new ResponseEntity<>(findByUserId,HttpStatus.CREATED);	
	}
	
	@GetMapping("/all")
	ResponseEntity<List<Contact>> getAllContact(){
		List<Contact> findByUserId = service.getAllContact();
		return new ResponseEntity<>(findByUserId,HttpStatus.CREATED);	
	}

}
