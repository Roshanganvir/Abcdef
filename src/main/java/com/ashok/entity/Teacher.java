package com.ashok.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="teacher_table")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String userName;
	
	private String fullName;
	
	private String email;
	
	private String password;
	
	private String mobile;
	
	
	private String currenrentPassword;
	
	private String dob;
	
	private boolean status;
	
	

}
