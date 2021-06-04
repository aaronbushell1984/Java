package com.fdmgroup.ood.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LoopsQuestions {

	public static void main(String[] args) {
//		Section 1 - For Each loops
//		1.1	Array of courses
//		Create an array of Strings called courses which contains the following items: "UNIX", "SQL", "Java", "Python", "Web Apps". Use a for each loop to display all of the courses. Modify the loop to display a sentence instead of just the course name. e.g. 	"I love learning UNIX"
//			"I love learning SQL" 
		String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
		for (String course : courses) {
			System.out.println("I love learning " + course);
		}
//
//		1.2	Copying to an ArrayList
//		Create an ArrayList of type String called coursesList. Use a for each loop to copy all the items from the courses array you created in the previous question into the ArrayList.
		ArrayList<String> coursesList = new ArrayList<>();
		for (String course : courses) {
			coursesList.add(course);
		}
//
//		1.3	Displaying courses
//		Use a for each loop to print out all of the courses stored in the ArrayList you created in question the previous question.
		for (String course : coursesList) {
			System.out.println(course);
		}
//
//		1.4	Total price
//		Create an ArrayList of type Double called prices. Add the following prices into the ArrayList: 4.50, 1.99, 9.75, 3.15, 10.25. Use a for each loop to add up all the prices. 
//		Display the total price.
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(4.50);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		
		Double sum = 0.00;
		for (Double price : prices) {
			sum += price;
		}
		System.out.println(sum);
//
//		1.5	Copying to an array
//		Create an empty double array with 5 elements. Use a for each loop to copy the prices from the ArrayList you made in the previous question into the array.
		Double[] doubleArray = new Double[5];
		System.out.println(Arrays.toString(doubleArray));
		
		for (int i = 0; i < prices.size(); i++) {
			doubleArray[i] = prices.get(i);		
		}
		System.out.println(Arrays.toString(doubleArray));
//
//		1.6	Adding numbers from a String
//		Create a String containing the following text: "10,7,25,3,8". 
//		Use the String's split() method to create a String array containing the numbers from the String. 
//		Now use a "for each" loop to add up the numbers in the array and display the total.
		String startString = "10,7,25,3,8";
		String[] splitString = startString.split(",");
		int total = 0;
		for (String string : splitString) {
			total += Integer.parseInt(string);
		}
		System.out.println(total);
		
//
//		1.7	Reversing a String
//		Create a String containing the following text: "desrever neeb sah txet siht". 
//		Use the String's toCharArray() method to create an array of chars containing each of the letters from the String. 
//		Finally use a "for each" loop to create a new String which contains all the letters of the original String in reverse order.
//		Display the new String.
		String text = "desrever neeb sah txet siht";
		char[] charactersFromText = text.toCharArray();
		String newText = "";
		for (char character : charactersFromText) {
			newText = character + newText;		
		}
		System.out.println(newText);
//
//		Section 2 - For Loops
//		2.1  One million
//		Use a for loop to display a list of all the numbers from 1 to a million.
		for (int i = 1; i < 1000001; i++) {
			System.out.println(i);
		}
//
//		2.2  Summing a million
//		Use a for loop to add up all the numbers from 1 to a million.
		long millionTotal = 0;
		
		for (int i = 0; i < 1000001; i++) {
			millionTotal += i;
		}
		System.out.println(millionTotal);
//
//		The answer should be 500000500000. Think about which type of variable would be suitable for storing a number of this size.
//
//		2.3 Odd numbers
//		Use a for loop to display a list of all the odd numbers from from 1 to 20.
		for (int i = 0; i < 21; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
//
//		2.4 Three times table
//		Use a for loop to display the three times table from 3 to 36 in the following format:
//
//		1 x 3 = 3
//		2 x 3 = 6
//		12 x 3 = 36
		for (int i = 0; i < 37; i++) {
			int product = 0;
			product = i * 3;
			System.out.println(i + " x 3 = " + product);
		}
//
//		2.5 Incrementing alternate numbers
//		Create an int array called scores containing the following numbers: 25, 15,99,75,47,59,82
		int[] scores = {25, 15, 99, 75, 47, 59, 82};
//
//		Use a for loop to increment every second item. When you've done this use another for loop to display all the values in the array. They should look like this:
		for (int i = 1; i < scores.length; i += 2) {
			scores[i] += 1;
		}
//		25
//		16
//		99
//		76
//		47
//		60
//		82
		for (int i : scores) {
			System.out.println(i);
		}
//
//
//		2.6 Alternate letters
//		Use a for loop to display every second letter of the alphabet starting from b.
//
//		2.7 All times tables
//		Use a for loop within a for loop to display all of the times tables from 2 to 12. The output should be in this format:
//
//
//		2 times table:
//
//		1 x 2 = 2
//		2 x 2 = 4
//		……..
//		……..
//
//		12 times table:
//
//		1 x 12 = 12
//		……
//		12 x 12 = 144
//		 
//		Section 3 - While Loops
//		3.1 One million
//		Use a while loop to display all the numbers up to 1 million.
//
//		3.2 Letters of the alphabet
//		Use a while loop to display the lower case letters of the alphabet from a to z.
//
//		3.3 Fibonacci sequence
//		The Fibonacci sequence starts like this:
//
//		0, 1, 1, 2, 3, 5, 8, 13, 21
//
//		The first number is 0, the second number is 1. After that each number is the sum of the two numbers before it.
//
//		Use a while loop to display all the Fibonacci numbers under 1000.
//
//		 
//		Section 4 - Controlling a loop with an if statement
//		4.1 Finding a city
//		Create a String array called cities which contains the following cities:  Glasgow, London, Birmingham, Cardiff, Manchester, Newcastle
//
//		Write a loop which loops through the names until it finds a name starting with 'B'. At this point the loop should terminate.
//
//		For each city you should diplay the city name and the message 'match' or 'doesn't match'. The output should look like this:
//
//		Glasgow - doesn't match
//		London - doesn't match
//		Birmingham - match
//
//
//		4.2 First number over 100
//		Create an int array called numbers which contains the following numbers: 6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91.
//
//		Write a loop which searches through the array until it finds the first number over 100. It should display this number and then terminate.
//
//		In this example it should display 103.


	}

}
