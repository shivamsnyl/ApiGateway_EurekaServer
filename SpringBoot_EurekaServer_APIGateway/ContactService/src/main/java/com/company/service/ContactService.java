package com.company.service;

import java.util.List;

import com.company.entities.Contact;

public interface ContactService {
	
	List<Contact> findByUserId(int userId);
	List<Contact> getAllContact();

}
