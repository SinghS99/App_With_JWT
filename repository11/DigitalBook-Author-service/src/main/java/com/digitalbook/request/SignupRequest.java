package com.digitalbook.request;

import java.util.Set;

public class SignupRequest {
	
	private String username;
	private String email;
	private Set<String> Role;
	private String password;

	public SignupRequest( String username, String email, Set<String> Role, String password) {
		this.username=username;
		this.email=email;
		this.Role=Role;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Set<String> getRole() {
		return Role;
	}

	public void setRole(Set<String> Role) {
		this.Role = Role;
	}

	public SignupRequest() {
		super();
	}

	
}
