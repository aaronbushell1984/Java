package com.fdmgroup.ood.modelanswers.inheritanceExercise;

public abstract class UserAccount {

	private String username;
	private String password;
	private String fullName;
	
	public UserAccount(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}
	
	public abstract void accessWebsite();
	
	public boolean changePassword(String password1, String password2) {
		
		if (password1.equals(password2)) {
			this.password = password1;
			return true;
		}
		return false;
	}
	
	
	
}
