package com.tem.workorder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7710925629196291236L;

	@Id
	@SequenceGenerator(name = "seq-gen", sequenceName = "workorder_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq-gen")
	@Column(name="id", insertable = true, updatable = false)
	private Integer Id;

	@Column(name="user_id")
	private String userId;
	
	@Column(name="userType")
	private String userType;
	
	@Column(name="first_name")
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="password")
	private String password;

	public String getUserId() {
		return userId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	
}
