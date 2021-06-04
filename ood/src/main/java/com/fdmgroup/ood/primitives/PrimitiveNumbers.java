package com.fdmgroup.ood.primitives;

public class PrimitiveNumbers {

	public static void main(String[] args) {
		// Section 2 - Primitive Numbers
		
		// 2.1 Favourite Number - Store your favourite number in an int. Then, using that variable, create a message that reveals your favourite number. Display that message.
		int favouriteNumber = 7;
		System.out.println("My favourite number is " + favouriteNumber);
		
		// 2.2 Adding ints - Create two int variables. One should store the number 5 and the other should store the number 3. Display the value of the two variables added together (i.e. 8).
		int firstNumber = 5;
		int secondNumber = 3;
		System.out.println("The total is " + (firstNumber + secondNumber));

		// 2.3 Arithmetic - Create an int variable called counter and give it the value 0;
		int counter = 0;

		// Now do the following:

		// •	Increment counter (i.e. increase it’s value by one)
		System.out.println(counter += 1); 
		// •	Add 5 to counter.
		System.out.println(counter += 5);
		// •	Decrement counter (i.e. decrease it’s value by one)
		System.out.println(counter -= 1);
		// •	Subtract 2 from counter.
		System.out.println(counter -= 2);
		// •	Double counter’s value.
		System.out.println(counter *= 2);
		// •	Display the value of counter (it should be 6)
		System.out.println(counter);

		// 2.4 Dividing different ints and doubles - Create the following int variables:
		// a with a value of 5, b with a value of 2.
		int a = 5;
		int b = 2;

		// Create the following double variables.
		// c with a value of 5, d with a value of 2.
		double c = 5;
		double d = 2;

		// Display the values of the following:

		// •	a divided by b
		System.out.println(a / b);
		// •	c divided by d
		System.out.println(c / d);
		// •	c divided by b
		System.out.println(c / b);
		// •	a divided by d
		System.out.println(a / d);

		// What do you notice? How might this affect calculating percentages?
		// Take care that information is not lost because of inaccurate int use

	}

}
