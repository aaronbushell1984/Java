package com.fdmgroup.ood.examples.loops;

import java.util.Arrays;
import java.util.List;

public class Loops {

	public static void main(String[] args) {

		// 1. for loops

		// general structure
		// the execution runs as follows:
		//     initialiser, 
		//     test condition: if true then execute the body of the loop
		//     next iteration, 
		//     test condition: if true then execute the body of the loop
		// and so on...
		
		// for(initialiser; test condition; next iteration) {
			// code
		// }
		
		
		
		// counter runs from 0 to 19 inclusive and prints the value.
		// when counter reaches 20 exit the loop
		System.out.println("for loop 0 to 19 inclusive:");
		for (int counter = 0; counter < 20; counter++) {
			System.out.println(counter);
		}

		// counter runs from 0 to 20 inclusive in steps of 5 and prints the value.
		// when counter reaches 25(which will be the next value) exit the loop
		System.out.println("for loop 0 to 20 inclusive steps of 5:");
		for (int counter = 0; counter <= 20; counter += 5) {
			System.out.println(counter);
		}

		// avoid using the following loop, it can result in an infinite loop and the
		// program will freeze

		// for(;;) {
		// if(somecondition)
		// break;
		// }

		// 2. for each loops
		String[] arrayOfStrings = { "A", "B", "C", "D" };
		System.out.println("foreach loop: A to D");

		for (String eachItem : arrayOfStrings) {
			System.out.println(eachItem);
		}

		// Later, you can also use this with Lists
		List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("foreach loop: 1 to 5");

		for (Integer eachItem : listNumbers) {
			System.out.println(eachItem);
		}

		// 3. while Loops:
		// an alternative to for loops.
		// useful where you might not know how many times it will execute from the start

		// initial value
		int counter = 0;
		System.out.println("while loop: 0 to 19 inclusive:");

		// test condition
		while (counter < 20) {

			// print counter
			System.out.println(counter);

			// next iteration
			counter++;
		}

		// 4. do while Loops:
		// very similar to while loops except they run once at the start before checking
		// the test condition

		// initial value
		counter = 0;
		System.out.println("do while loop: 0 to 19 inclusive:");

		do {

			System.out.println(counter);

			// next iteration
			counter++;

			// test condition
		} while (counter < 20);

		// beware the infinite loop: avoid

//		while (true) {
//			System.out.println("looping");
//			// no exit condition: needs a check so that an exit is possible
//		}

		
		
		
		
		
	}

}
