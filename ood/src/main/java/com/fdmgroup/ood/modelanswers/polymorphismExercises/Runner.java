package com.fdmgroup.ood.modelanswers.polymorphismExercises;

public class Runner {

	public static void main(String[] args) {
		System.out.println("PART 2");
		AdminUser adminUser1 = new AdminUser("nick","password1","nick lawton");
		AdminUser adminUser2 = new AdminUser("kevin","password2","kevin wright");
		
		Customer customer1 = new Customer("john","password3","john smith");
		Customer customer2 = new Customer("jane","password4","jane jones");

		AdminUser.setMinAdminPasswordLength(10);
		
		adminUser1.changePassword("tooShort", "tooShort");
		System.out.println("admin user1's password is now: "+adminUser1.getPassword());
	
		adminUser2.changePassword("longEnough", "longEnough");
		System.out.println("admin user2's password is now: "+adminUser2.getPassword());
		
		System.out.println("PART 3");
		adminUser1.changePassword("newPwd", "newPwd", customer1);
		System.out.println("customer1's password is now: "+customer1.getPassword());
		
		System.out.println("PART 4");
		Customer.setMinCustomerPasswordLength(7);
		customer1.changePassword("7letter", "7letter");
		customer2.changePassword("short", "short");
		System.out.println("customer1's password is now: "+customer1.getPassword());
		System.out.println("customer2's password is now: "+customer2.getPassword());
	}

}
