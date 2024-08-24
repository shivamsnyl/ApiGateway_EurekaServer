package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	List<Contact> findByUserId(int userId);
}
