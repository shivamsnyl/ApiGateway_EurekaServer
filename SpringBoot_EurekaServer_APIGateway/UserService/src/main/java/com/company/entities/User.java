package com.company.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	private int userId;
	private String userName;
	private String userAddress;
	
	@Transient
	private List<Contact> contact;

	public User(int userId, String userName, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	

}
