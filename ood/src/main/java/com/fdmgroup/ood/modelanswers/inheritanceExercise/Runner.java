package com.fdmgroup.ood.modelanswers.inheritanceExercise;

public class Runner {

	public static void main(String[] args) {
		System.out.println("PART 2");
		AdminUser adminUser1 = new AdminUser("nick","password1","nick lawton");
		AdminUser adminUser2 = new AdminUser("kevin","password2","kevin wright");
		
		Customer customer1 = new Customer("john","password3","john smith");
		Customer customer2 = new Customer("jane","password4","jane jones");
		
		adminUser1.changePassword("newPassword", "newPassword");
		System.out.println(adminUser1.getUsername()+", "+adminUser1.getPassword());
		
		customer1.changePassword("newPassword", "password");
		System.out.println(customer1.getUsername()+", "+customer1.getPassword());
		
		adminUser2.accessWebsite();
		customer2.accessWebsite();

		System.out.println("PART 3");
		
		UserAccountManager userAccountManager = new UserAccountManager();
		userAccountManager.addUser(adminUser1);
		userAccountManager.addUser(adminUser2);
		userAccountManager.addUser(customer1);
		userAccountManager.addUser(customer2);
		
		boolean loggedOnWithValidCredentials = userAccountManager.login("kevin", "password2");
		System.out.println("logged on with valid credentials: "+loggedOnWithValidCredentials);
		
		boolean loggedOnWithInvalidCredentials = userAccountManager.login("jane", "password3");
		System.out.println("logged on with invalid credentials: "+loggedOnWithInvalidCredentials);

	}

}
