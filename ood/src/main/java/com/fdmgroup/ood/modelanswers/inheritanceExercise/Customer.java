package com.fdmgroup.ood.modelanswers.inheritanceExercise;

public class Customer extends UserAccount {

	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website as a customer");
	}

}
