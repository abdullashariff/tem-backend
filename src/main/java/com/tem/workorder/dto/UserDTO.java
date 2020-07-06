package com.tem.workorder.dto;

import java.io.Serializable;

public class UserDTO implements Serializable	{

	/**
	 * 
	 */
	private static final long serialVersionUID = -267537503097705732L;

	private String userId;
	
	private String userType;
	
	private String firstName;
	
	private String lastName;
	
	private String organization;
	
	private String password;

	public String getUserId() {
		return userId;
	}

	public String getUserType() {
		return userType;
	}

	public String getLastName() {
		return lastName;
	}

	public String getOrganization() {
		return organization;
	}

	public String getPassword() {
		return password;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
