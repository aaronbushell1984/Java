package com.fdmgroup.ood.examples.arraylists;

public class ArraysExample {

	public static void main(String[] args) {
		// There are two ways to create an array:

		int[] scores = new int[3];
		// This creates an array with default values.

		System.out.println(scores[0]); // Arrays start at index 0.

		scores[1] = 13; // sets the value at index of 1 to be 13;

		System.out.println(scores[1]);

		System.out.println(scores.length); // Arrays do not have methods, this is the only variable associated with
											// them.

		// Alternate way of making an array.
		String[] names = { "Gus", "Andrew", "Justin", "Jun", "Michael", "Elizabeth" };

		System.out.println(names[3]); // Still acts the same way.
	}
}
