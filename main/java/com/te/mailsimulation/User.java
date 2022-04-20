package com.te.mailsimulation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	@Id
	private String emailid;
	private String password;
}
