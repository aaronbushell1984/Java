package com.fdmgroup.ood.collections;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Empty Array
		int[] intArray = new int[10];
		int arrayLength = intArray.length;
		System.out.println(arrayLength);
		
		// Zero indexed ArrayIndexOutOfBoundException
		// intArray[10] = 10;
		
		// overwrite contents by index position
		// use Array object to use convert to string method to avoid printing the reference rather that contents
		intArray[0] = 1;
		intArray[9] = 10;
		System.out.println(Arrays.toString(intArray));
		
		// create a string array
		String[] cars = {"Ford", "Jaguar", "BMW"};
		System.out.println(Arrays.toString(cars));
		
		// sort array changes the actual order of original array
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		// change first item
		cars[0] = "Audi";
		System.out.println(Arrays.toString(cars));
		
		// Resizing - arrays are fixed
		// Make a copy which will have null values
		String moreCars[] = Arrays.copyOf(cars, 4);
		System.out.println(Arrays.toString(moreCars));
		// add to array new values
		moreCars[3] = "Honda";
		System.out.println(Arrays.toString(moreCars));
		
		// basic for each loop
		for (String car : moreCars) {
			System.out.println(car);
		}

	}

}
