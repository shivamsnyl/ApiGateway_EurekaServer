package com.company.entities;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CONTACT-MS",url = "http://localhost:9090")
public interface UserContactFeign {
	
	@GetMapping("/contact/{userId}")
	List<Contact> getContactByUserId(@PathVariable int userId);

}
