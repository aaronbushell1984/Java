package com.fdmgroup.ood.modelanswers.polymorphismExercises;

public class AdminUser extends UserAccount {

	private static int minAdminPasswordLength;
	
	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
	}
	
	
	public boolean changePassword(String password1, String password2, UserAccount user) {
		return user.changePassword(password1, password2);
	}
	
	@Override
	public boolean changePassword(String password1, String password2) {
		if (password1.length() >= minAdminPasswordLength) {
			return super.changePassword(password1,password2);
		}
		return false;
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
	}

	public static int getMinPasswordLength() {
		return minAdminPasswordLength;
	}

	public static void setMinAdminPasswordLength(int minPasswordLength) {
		AdminUser.minAdminPasswordLength = minPasswordLength;
	}

}
