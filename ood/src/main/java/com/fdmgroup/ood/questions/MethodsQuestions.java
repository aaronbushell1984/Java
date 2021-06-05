package com.fdmgroup.ood.questions;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsQuestions {

	public static void main(String[] args) {
		int points = getPoints("pink");
		System.out.println("You've scored " + points + " points!");
		
		int number = 5;
		System.out.println(sumOfnumbersUpTo(number));
		
		int accountNumber = 36003640;
		System.out.println(validAccountNumber(accountNumber));
		
		String text = "desrever neeb sah txet siht";
		System.out.println(reverseString(text));
		
		int fibPosition = 5;
		System.out.println(fibonacciNumber(fibPosition));
		
		int timesTable = 5;
		displayTimesTable(timesTable);
		
		int vertical = 5;
		int horizontal = 10;
		printRectangle(vertical, horizontal);
		
		int legs = 4;
		printTriangle(legs);
	}
//		Section 1 - Modularising previous exercises
//		In this section's exercises, you should ensure that your method uses the 'static' keyword in its header. You should call the method from the main method in the same class. 
//
//		1.1	Alien colours
//		You're going to modularise your code from exercise 1.3 in the If statements module. 
//		Create a method called getPoints. The method should take the colour of the alien as an argument and should return the number of points you get for that colour as an int.
//		Copy your code from the original exercise into your method and modify it so that it returns only the number as an int and not the full sentence. If an invalid colour is entered the method should return 0.
	public static int getPoints(String alienColour) {
		if (alienColour == "green") {
			return 5;
		} else if (alienColour == "red") {
			return 10;
		} else if (alienColour == "yellow") {
			return 15;
		} else {
			return 0;
		}
	}
//		The code in your main method should look like this:
//		int points = getPoints("green";
//		System.out.println("You've scored "+points" points!";
//		1.2	Summing numbers
//		Create a method called sumOfNumbersUpTo. It should take an int as an argument and return a long. 
//		Take your code from the Loops module exercise 2.2. Put it into the method and modify it so that it counts up to whatever number you entered as an argument.
//		For instance:
//
//			If you pass in 5 as an argument the method should return 15  (1+2+3+4+5)
//			if you pass in 10 as an arugment the method should return 55.
//		Display the result in the main method.
	private static long sumOfnumbersUpTo(int number) {
		long total = 0;
		for (int i = 0; i <= number; i++) {
			total += i;
		}
		return total;
	}
	
//		1.3	Valid account numbers
//		Create a method called validAccountNumber. It should take an int as an argument and return a Boolean depending on whether the account number is valid or not.
//		Take your code from the If statements module exercise 2.1 and modify it so that the method returns true if the account number is valid and false otherwise.
//		In the main method you should display the value returned by the method.
	private static boolean validAccountNumber(int accountNumber) {
		if (accountNumber > 9999999 && accountNumber <= 99999999) {
			return true;
		} else {
			return false;
		}	
	}

//		1.4	Reversing a String
//		Create a method called revserseString. It should take a String and return another String which is the reverse of the original String.
//
//		Take your code from the Loops module exercise 1.7. Modify it so that it returns the reversed String.
//
//		In the main method you should display the value returned by the method.
	private static String reverseString(String text) {
		char[] charactersFromText = text.toCharArray();
		String newText = "";
		for (char character : charactersFromText) {
			newText = character + newText;		
		}
		return newText;
	}
	
//		1.5	Fibonacci number
//		You're going to create a more flexible version of the Fibonacci code used in Loops exercise 3.3. 
//
//		Here's a reminder of the start of the sequence:
//
//		0, 1, 1, 2, 3, 5, 8, 13, 21
//
//		Write a method called FibonacciNumber. It should take an int as an argument which represents the position in the sequence. The method should return the number in that position. 
//
//		For instance:
//			If you pass in 1, the method should return 0
//			If you pass in 2, the method should return 1
//			If you pass in 3, the method should return 1
//			If you pass in 4, the method should return 2
//
//		Test your method out by calling it from the main method and displaying its return value.
	private static int fibonacciNumber(int position) {
		ArrayList<Integer> fibArray = new ArrayList<>();
		fibArray.add(0);
		fibArray.add(1);
		fibArray.add(1);
		int fibSum = 0;
		int counter = 3;
		while (fibSum < 1000) { 
			fibArray.add(fibArray.get(counter-1) + fibArray.get(counter-2));
			fibSum = Collections.max(fibArray);
			counter++;
		}
		return fibArray.get(position-1);
	}
//
//		
//		Section 2 - Void methods
//		In this section's exercises, you should ensure that your method uses the 'static' keyword in its header. You should call the method from the main method in the same class. 
//
//		2.1	Times table
//		Create a method called displayTimesTable. It should take an int as an argument and display the times table for that int in the same format as in Loops exercise 2.4.
//
//		For instance if the argument is 3 the method should display the 3 times table. If the argument is 5 the method should display the 5 times table.
//
//		The method shouldn't return anything.
	
	private static void displayTimesTable(int timesTable) {
		for (int i = 0; i < 37; i++) {
			int product = 0;
			product = i * timesTable;
			System.out.println(i + " x " + timesTable + " = " + product);
		}
	}
//
//		2.2	Print rectangle
//		Write a void method called printRectangle which takes two int arguments containing the vertical and horizontal dimensions of a rectangle. The method should print out a rectangle of the required dimensions using the letter X.
//
//		For instance if the vertical dimension is 4 and the horizontal dimension is 3, the method should print:
//		XXX
//		XXX
//		XXX
//		XXX
	private static void printRectangle(int vertical, int horizontal) {
		for (int i = 0; i < vertical; i++) {
			String pattern = "X";
			System.out.println(pattern.repeat(horizontal));			
		}
	}
//
//		
//		2.3 Print triangle
//		Write a void method called printTriangle which takes one int argument containing the size of the legs of a right angled triangle. The method should print out a triangle of the required dimensions using the letter X.
//
//		For instance if the size is 3, the following triangle should be displayed:
//		X
//		XX
//		XXX 
//
//		If the size is 4, the following triangle should be dislayed
//		X
//		XX
//		XXX
//		XXXX
	private static void printTriangle(int legs) {
		for (int i = 1; i <= legs; i++) {
			String pattern = "X";
			System.out.println(pattern.repeat(i));			
		}
	}
//
//		Section 3  - Methods with test cases
//		In this section's exercises you'll be using pre-written test cases to check if your code works. Import the project 'exercise5-testcases' into Eclipse. The method header for each of the 8 methods in this section has already been created. You need to complete the code in the method and then run the test. 
//
//		3.1 Leap years
//		Write a method called leapYear. It should take an int argument containing a year and return a boolean which is true if the year is a leap year.
//
//		Leap years are divisible by 4. However the first year of a century is not a leap year unless the year is divisible by 400.
//
//		E.g. 		2016 is a leap year so should return true
//				2019 is not a leap year so should return false
//				2000 is a leap year so should return true
//				1900 is not a leap year so should return false
//
//
//		3.2 Array contains
//		Write a method called arrayContains. It should take two arguments: a String array and a String. The method should return a Boolean: true if the array contains the String and false otherwise.
//
//
//		3.3 Array frequency
//		Write a method called arrayFrequency. It should take two arguments: an int array and a int. The method should return an int containing the number of times the int occurs in the array.
//
//		3.4  Highest number
//		Write a method called maxNumber. It should take an int array as an argument. It should return an int containing the highest number in the array. Note that numbers in the array could be positive or negative. So in this array: [-7,-4,-9] the highest number would be -4.
//
//		3.5	 Extracting even numbers
//		Write a method called extractEvenArray. It should take an int array as an argument. It should return an int array which contains all of the even numbers from the original array. The returned array should not be any bigger than the size required to hold the even numbers. The even numbers in the returned array should be in the same order as in the original array. For example:
//
//		With this array as an argument: 	[2,5,3,7,6,7,3,4,3]
//
//		The method would return:		[2,6,4]
//
//
//		3.6	Reversing an array
//		Write a method called reverseStringArray. It should take a String[] array as an argument and should return a reversed copy of the array. The original array should not be reversed.
//
//		3.7	Finding anagrams
//		Write a method called isAnagram. It should take two Strings as arguments. If the Strings are anagrams of each other the method should return the boolean true, otherwise it should return false.
//
//		3.8	Median number
//		Write a method called medianNumber which takes an array of doubles and returns the median value. 
//
//		Argument:
//			An array of doubles
//
//		Return value:
//			A double containing the median value from the array
//
//		For example:
//
//			Array [1.0, 2.0, 3.0, 4.0, 5.0] would return 3.0 as this is the middle value
//			Array [1.0, 2.0, 3.0, 4.0] would return 2.5 as this is the mean of the two middle values (2.0 and 3.0)
//			Array [7.4, 3.9, 1.2, 9.7, 2.3] would return 3.9 as this is the middle value
//			Array [7.4, 3.9, 1.2, 9.7, 2.3, 8.2] would return 5.65 as this is the mean of the two middle values (3.9 and 7.4)
//
//		Section 4 - Combining methods
//		Each of the methods you're going to write in the section will call one or more of the methods you wrote in the previous sections.  For each question, copy the method from the earlier section into the same class as the method you're writing. Ensure that all methods in the class use the 'static' keyword. Call your method from the main method. 
//
//		4.1  Palindrome
//		A palindrome is a word which is the same when it is reversed. Simple examples include:
//
//		madam, kayak, racecar, radar, level
//
//		Write a method called isPalindrome. The method should take a String as an argument. It should return a boolean. 
//
//		The method should use the reverseString method you wrote in exercise 1.4. 
//
//
//		4.2 Times tables
//		You're going to write a method called displayTimesTablesUpTo. The method will take an int as an argument and display all of the times tables up to that number.
//
//		For instance:
//			If you call the method passing in 3, it will display the 1, 2 and 3 times tables.
//			If you call the method passing in 5, it will display the 1, 2, 3, 4 & 5 times tables.
//
//		Your method should use the displayTimesTable method you created in exercise 2.1.
//		4.3 Highest number frequency
//		Write a method called maxNumberFrequency. It should take an int array as an argument and return the number of times the highest number in the array occurs.
//
//		For example:
//
//		[2,5,3,7,6,7,3,4,3]
//
//		The method would return 2 for this array. The highest number is 7 and it occurs twice.
//
//		Make use of the methods you wrote in parts 3.3 and 3.4. 


}
