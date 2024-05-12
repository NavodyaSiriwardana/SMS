package com.sms.dto;

public class BasicUserDetailDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String roleName;
	private int roleId;
	
	public BasicUserDetailDTO() {
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.phoneNumber = "";
		this.roleName ="";
		this.roleId = 0;
		
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "BasicUserDetailDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", roleName=" + roleName + ", roleId=" + roleId + "]";
	}


	
	
}
