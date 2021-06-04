package com.fdmgroup.ood.primitives;

public class PrimitiveChars {

	public static void main(String[] args) {
		// Section 3 – chars
		// Create a char called letter and give it the value of ‘a’.
		char letter = 'a';
		// Create an int called code and give it the value of 98.
		int code = 98;
		
		// •	Display the value of the letter variable cast to an int (should be 97)
		int letterAsInt = letter;
		System.out.println(letterAsInt);
		// •	Display the value of the code variable cast to a char (should be ‘b’)
		char codeAsChar = (char)code;
		System.out.println(codeAsChar);
		// •	Display the value of the number 36 cast to a char (should be a $)
		System.out.println((char)36);

		// 3.2 Difference between letters -

		// 	•	Display the value of ‘c’ minus ‘a’ (should be 2)
		System.out.println((int)'c' - (int)'a');
		// 	•	Display the value of ‘z’ minus ‘a’ (should be 25)
		System.out.println((int)'z' - (int)'a');

		// 3.3 Adding chars and Strings -

		// Create a char called char1 and give it the value ‘x’
		char char1 = 'x';
		// Create a char called char2 and give it the value ‘y’
		char char2 = 'y';
		// Create a char called char3 and give it the value ‘z’
		char char3 = 'z';

		// Create a String called string1 and give it the value “z”
		String string1 = "z";
		// Create a String called string2 and give it the value “y”
		String string2 = "y";

		// Display the following:
		// •	char1 + char2 + char3
		System.out.println(char1 + char2 + char3);
		// •	char1 + char2 + string2
		System.out.println(char1 + char2 + string2);
		// •	char1 + string1 + char3
		System.out.println(char1 + string1 + char2);
		// What do you notice?
		// Print treats character numbers as numbers for arithmetic until a string is introduced and then it treats all remaining chars as a string	
	}

}
