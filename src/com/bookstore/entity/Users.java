package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users 
{
	private Integer userId;
	private String email;
	private String fullName;
	private String password;
	
	public Users()
	{
		
	}
	
	public Users(Integer userId,String email, String fullName,String password)
	{
		this.userId = userId;
		this.email= email;
		this.fullName = fullName;
		this.password = password;
	}
	
	
	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name ="full_name")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", email=" + email + ", fullName=" + fullName + ", password=" + password
				+ "]";
	}
	
}
