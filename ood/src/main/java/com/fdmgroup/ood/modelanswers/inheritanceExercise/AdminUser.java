package com.fdmgroup.ood.modelanswers.inheritanceExercise;

public class AdminUser extends UserAccount {

	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
	}

}
