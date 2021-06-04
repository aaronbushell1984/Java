package com.fdmgroup.ood.wrappers;

public class Wrappers {

	public static void main(String[] args) {

		// Section 4 – Wrappers
		
		// 4.1 Convert Strings to ints
		// Create a String called number1 and give it the value “5”.
		String number1 = "5";
		// Create a String called number2 and give it the value “3”.
		String number2 = "3";
		// Use the parseInt() method of the Integer class to convert the Strings into ints. Add the ints together and display the result (should show 8)
		int resultStringToInt = Integer.parseInt(number1) + Integer.parseInt(number2);
		System.out.println(resultStringToInt);

		// 4.2 Convert Strings to doubles - 
		// Create a String called number1 and give it the value “5.3”.
		String number3 = "5.3";
		// Create a String called number2 and give it the value “3.2”.
		String number4 = "3.2";
		// Use the parseDouble() method of the Double class to convert the Strings into doubles. Add the doubles together and display the result (should show 8.5)
		double resultStringToDouble = Double.parseDouble(number3) + Double.parseDouble(number4);
		System.out.println(resultStringToDouble);

		// 4.3 Extracting numbers from Strings - 
		// Create a String called string1 and give it the value “abc11”.
		String string1 = "abc11";
		// Create a String called string2 and give it the value “9xyz”.
		String string2 = "9xyz";
		// Create a String called string3 and give it the value “abc7xyz”.
		String string3 = "abc7xyz";

		// Extract the numbers from the strings, convert them into ints and display the value of them added together (should show 27)
		int stringToNumber1 = Integer.parseInt(string1.substring(3));
		int stringToNumber2 = Integer.parseInt(string2.substring(0, 1));
		int stringToNumber3 = Integer.parseInt(string3.substring(3, 4));
		System.out.println(stringToNumber1 + stringToNumber2 + stringToNumber3);
	}

}
