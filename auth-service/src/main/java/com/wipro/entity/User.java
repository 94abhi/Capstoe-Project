package com.wipro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	  private String userName;
	  private String userEmail;
	  private String password;
	  private String role;
	  private String shippingAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public User(int id, String userName, String userEmail, String password, String role, String shippingAddress) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.role = role;
		this.shippingAddress = shippingAddress;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  
	
	  
}
