package com.company.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact {
	
	@Id
	private int contactId;
	private int phoneNo;
	private String email;
	private int userId;

}
