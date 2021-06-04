package com.fdmgroup.ood.examples.datatypes;

public class StringExamples {

	public static void main(String[] args) {
		// Two ways of creating a String.
		String username = new String("admin");
		String password = "password123";

		// String comparison
		String otherUsername = new String("admin");
		String otherPassword = "password123";

		System.out.println("Do two new Strings share same memory reference: " + (username == otherUsername));
		System.out.println("Do two explicit Strings share same memory reference: " + (password == otherPassword));

		System.out.println("Do two new Strings share same data: " + username.equals(otherUsername));
		System.out.println("Do two explicit Strings share same data: " + password.equals(otherPassword));

		// Common String methods
		System.out.println("Substring with starting index: " + username.substring(3));
		System.out.println("Substring with starting and ending index: " + password.substring(0, 5));
		System.out.println("Index of i: " + username.indexOf("i"));
		System.out.println("Index of z: " + username.indexOf("z"));

		// Remember- these methods will not change the original value of username or
		// password.

		System.out.println(username);
		System.out.println(password);

	}
}
