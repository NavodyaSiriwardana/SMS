package com.sms.dto;

public class UserDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private int roleId;
	
	public UserDTO() {
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.phoneNumber = "";
		this.password = "";
		this.roleId = 0;	
		
	}
	
	public UserDTO(int id, String firstName, String lastName, String email, String phoneNumber, String password,
			boolean isActive, int roleId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.roleId = roleId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", roleId=" + roleId + "]";
	}

	
	
}
