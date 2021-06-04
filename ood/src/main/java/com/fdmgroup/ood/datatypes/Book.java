package com.fdmgroup.ood.datatypes;

public class Book {
	
	String title;
	double price;
	
	
	// Source -> Generate Constructor using fields
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getDetails() {
		return title + " " + price;
	}
	
	// Source -> Generate to String
	@Override // allows override of default object class
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
