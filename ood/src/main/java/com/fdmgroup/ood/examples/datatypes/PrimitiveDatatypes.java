package com.fdmgroup.ood.examples.datatypes;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		// primitive data types are lowercase.

		int age = 25;
		double gradeAverage = 85.9;

		// we can print out the values to the console via System.out.println();

		System.out.println(age);
		System.out.println(gradeAverage);

		// for larger numbers, underscores can be used to denote commas.

		double largeNumber = 1_234_567_890.123_456_789;

		System.out.println(largeNumber);

		// numbers from smaller data types can be put into larger data types.
		// this is known as an implicit cast.

		short smallDataType = 130;
		long bigDataType = smallDataType; // long bigDataType = (long) smallDataType;
		System.out.println(bigDataType);

		// numbers from larger data types cannot be put into smaller data types without
		// an cast to the smaller data type.
		// this is known as an explicit cast.

		smallDataType = (short) bigDataType;
		System.out.println(smallDataType);

		// Note: This can cause a loss of data if not careful.
		smallDataType = (short) gradeAverage;
		System.out.println(smallDataType);
		
		smallDataType = (short) largeNumber;
		System.out.println(smallDataType);
		
	}
}