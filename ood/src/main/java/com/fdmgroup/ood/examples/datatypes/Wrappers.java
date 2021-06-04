package com.fdmgroup.ood.examples.datatypes;

public class Wrappers {

	public static void main(String[] args) {
		int intPrimitive = 5555;
		Integer integerObject = intPrimitive;
		// Same thing:
		integerObject = new Integer(intPrimitive);

		// The wrapper, when printed out, will look exactly like its primitive
		// equivalent
		System.out.println(integerObject);

		// We can use wrappers to convert to other data types.
		System.out.println(integerObject.doubleValue());

		// Wrappers can also be used to parse Strings and convert them into Integer
		// objects.
		System.out.println(Integer.parseInt("5555"));

		intPrimitive = integerObject;
		// Same thing
		intPrimitive = integerObject.intValue();

		// Just for fun, this is the maximum and the minimum value an integer can hold.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}
}