package com.app.bak.model;

import java.io.Serializable;
import java.util.List;

import com.app.bak.enums.AccessType;

/**
 * @author anilb
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String userId;
	private String name;
	private String password;
	private String email;
	private String mobileNumber;
	private List<AccessType> accessTypes;

	public User() {
		super();
	}

	/**
	 * @param id
	 * @param userId
	 * @param fullName
	 * @param password
	 * @param email
	 * @param mobileNumber
	 * @param accessTypes
	 */
	public User(int id, String userId, String name, String password, String email, String mobileNumber,
			List<AccessType> accessTypes) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.accessTypes = accessTypes;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the accessTypes
	 */
	public List<AccessType> getAccessTypes() {
		return accessTypes;
	}

	/**
	 * @param accessTypes the accessTypes to set
	 */
	public void setAccessTypes(List<AccessType> accessTypes) {
		this.accessTypes = accessTypes;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", password=" + password + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", accessTypes=" + accessTypes + "]";
	}

}
