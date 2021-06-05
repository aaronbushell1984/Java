package com.fdmgroup.ood.modelanswers.polymorphismExercises;

public class Customer extends UserAccount {

	private static int minCustomerPasswordLength;
	
	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);
	}
	
	@Override
	public boolean changePassword(String password1, String password2) {
		if (password1.length() >= minCustomerPasswordLength) {
			return super.changePassword(password1,password2);
		}
		return false;
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website as a customer");
	}

	public static int getMinCustomerPasswordLength() {
		return minCustomerPasswordLength;
	}

	public static void setMinCustomerPasswordLength(int minCustomerPasswordLength) {
		Customer.minCustomerPasswordLength = minCustomerPasswordLength;
	}

}
