package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entities.Contact;
import com.company.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository repository;

	@Override
	public List<Contact> findByUserId(int userId) {
		
		return repository.findByUserId(userId);
	}

	@Override
	public List<Contact> getAllContact() {
		return repository.findAll();
	}


}
