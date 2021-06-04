package com.fdmgroup.ood.examples.datatypes;

//This is an example of a reference data type.
public class Student {

	String name; // Reference (classes) can have other reference types as variable
	int age; // references can also hold primitive data types.

	// This is a method that the student class can call to access the information.
	//It returns a String object.
	public String getInfo() {
		return "Name: " + name + " Age: " + age;
	}

	//This is an example of a 'getter' method. It's purpose is to return a specific variable.
	public String getName()
	{
		return name;
	}
	//This is a void method. Void methods do not return any values, and thus have no return keyword.
	//This is also example of a 'setter' method.
	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getInfo());
		student.setName("Ivan");
		student.setAge(20);
		System.out.println(student.getInfo());
	}
}
