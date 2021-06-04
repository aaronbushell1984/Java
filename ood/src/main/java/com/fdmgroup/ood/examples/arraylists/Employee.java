package com.fdmgroup.ood.examples.arraylists;

//This is an example of a reference data type.
public class Employee {

	private String name;
	private String title;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(String newTitle) {
		title = newTitle;
	}

	public String toString() {
		return "Name: " + name + " Age: " + title;
	}

}
