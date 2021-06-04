package com.fdmgroup.ood.datatypes;

public class DemoPrimatives {

	public static void main(String[] args) {
		int intNumber = 0;
		intNumber += 1;
		System.out.println("intNumber equals " + intNumber);
		
		long longNumber = 12345678;
		System.out.println("longNumber equals " + longNumber);
		
		// print treats variables as strings and adds strings not the number
		System.out.println("Adding int and long  " + intNumber + longNumber);
		// Either cast and add first or wrap to perform the arithmetic
		long total = intNumber + longNumber;
		System.out.println("Cast and then add numbers " + total);
		System.out.println("Bracket int and long  " + (intNumber + longNumber));
		
		byte byteNumber = 127;
		System.out.println("byteNumber = " + byteNumber);
		byteNumber += 1;
		System.out.println("bytNumber rollover = " + byteNumber);
		
		short shortNUmber = 12345;
		System.out.println("shortNumber = " + shortNUmber);
		
		// Float must be declared with f otherwise it will error
		float floatNumber = 0.123f;
		double doubleNumber = 0.321;
		
		// Double holds larger numbers so cannot convert to float - MUST OVERRIDE CAST if fully aware of data loss -- EXPLICIT CASTING
		float floatAndDouble = (float) (floatNumber + doubleNumber);
		System.out.println("Convert float to a double " + floatAndDouble);
		
		// Float is smaller than double so can convert automatically -- IMPLICIT CASTING
		double doubleAndFloat = floatNumber + doubleNumber;
		System.out.println("Convert float to a double " + doubleAndFloat);
		
		// Char must be placed in single quotes
		char myChar = 'A';
		System.out.println("myChar = " + myChar);
		myChar = '\u0050';
		System.out.println("myChar = " + myChar);
		
		boolean trueOrFalse = false;
		System.out.println("trueOrFalse = " + trueOrFalse);
		trueOrFalse = true;
		System.out.println("trueOrFalse = " + trueOrFalse);
		
		// checks references are the same only
		if (myChar == 'A') {
			System.out.println("myChar is not = A");
		}
		
	}

}
