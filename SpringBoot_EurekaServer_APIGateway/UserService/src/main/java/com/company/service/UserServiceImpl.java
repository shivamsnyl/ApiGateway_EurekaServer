package com.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entities.Contact;
import com.company.entities.User;
import com.company.entities.UserContactFeign;
import com.company.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Autowired
	UserContactFeign feign;
	
	@Override
	public User findUserById(int userId) {
		
		 Optional<User> findById = repository.findById(userId);
		 
		 if(findById.isPresent()) {
			 List<Contact> contactLsit = feign.getContactByUserId(userId);
			 
			 User user = findById.get();
			 user.setContact(contactLsit);
			 return user;
		 }
		 else {
			 return null;
		 } 
	}

	@Override
	public List<User> findAllUsers() {
		 
		
		List<User> findAll = repository.findAll();
		 for(User u: findAll) {
			 List<Contact> contactLsit = feign.getContactByUserId(u.getUserId());
			u.setContact(contactLsit);
		 }
		 
		 return findAll;
	}

}
