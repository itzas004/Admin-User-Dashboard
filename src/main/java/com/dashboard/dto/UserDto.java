package com.dashboard.dto;

public class UserDto {
	private String email;
	private String password;
	public UserDto(String email, String password, String fullName, String role) {
		super();
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String fullName;
	private String role;
}
