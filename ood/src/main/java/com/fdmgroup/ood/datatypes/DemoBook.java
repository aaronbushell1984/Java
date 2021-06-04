package com.fdmgroup.ood.datatypes;

public class DemoBook {

	public static void main(String[] args) {
		
		Book myFirstBook = new Book("My First", 9.99);
		
		Book mySecondBook = new Book("My Second", 15.99);
		
		System.out.println(myFirstBook);
		System.out.println(mySecondBook);
		
		// Object class is the parent class for all objects		
		Object myObject = new Object();
		System.out.println(myObject);

	}

}
