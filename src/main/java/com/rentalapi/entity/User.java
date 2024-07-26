package com.rentalapi.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	@Column(name = "name")
	private String username;
	private String password;
	//private Date created_at;
	//private Date updated_at;
	
	@Transient
	private String role;
	/*private long surface;
	private String picturePath;
	private String description;
	private int owner_id;*/
	
	

}
