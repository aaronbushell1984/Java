package com.fdmgroup.ood.modelanswers.polymorphismExercises;

import java.util.ArrayList;
import java.util.List;

public class UserAccountManager {

	private List<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public void addUser(UserAccount userAccount) {
		userAccounts.add(userAccount);
	}
	
	public boolean login(String username, String password) {
		for (UserAccount userAccount : userAccounts) {
			String currentUserName = userAccount.getUsername();
			String currentPassword = userAccount.getPassword();
			if (currentUserName.equals(username) && currentPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}
	
}
