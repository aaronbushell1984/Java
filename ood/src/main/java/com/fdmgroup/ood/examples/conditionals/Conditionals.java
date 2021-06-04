package com.fdmgroup.ood.examples.conditionals;

public class Conditionals {

	public static void main(String[] args) {

//Operators

//We can use any of the following operators with conditional statements:

//Less than:                 a < b
//Less than or equal to:     a <= b
//Greater than:              a > b
//Greater than or equal to:  a >= b
//Equal to:                  a == b
//Not equal to:              a != b


		
// 1. if statement

		int a = 2;
		int b = 1;
		if (a > b) {
			System.out.println("a > b");
		}

// 2. if else statement

		a = 2;
		if (a < 1) {
			System.out.println("a < 1");
		} else {
			System.out.println("a is not less than 1");
		}

// 3. if else if statement

		a = 1;
		if (a < 1) {
			System.out.println("true");
		} else if (a > 1) {
			System.out.println("false");
		} else {
			System.out.println("neither");
		}

// 4. if else statement rewritten as a ternary operator

// Rewrite this if statement:

		a = 1;
		String strResult = "";
		if (a < 1) {
			System.out.println("true result");
		} else {
			System.out.println("false result");
		}

// rewrite this code using the ternary operator.
// It does exactly the same thing
// the code is more concise but slightly less clear

// the variable strResult is assigned the value of "true" is a is less than 1. 
// in all other cases, it will be assigned the value of "false"

		a = 1;
		strResult = (a < 1) ? "true result" : "false result";
		System.out.println(strResult);

// the variable boolResult is assigned the value of true is a is less than 1. 
// in all other cases, it will be assigned the value of false

		a = 1;
		boolean boolResult = (a < 1) ? true : false;
		System.out.println(boolResult);

// with ternary operators you can use any data type to store any value
// the general syntax is    (operation)? T:F

// 5. switch statements

// if you want to use lots of if statements in your code then a more concise way of writing 
// the code is to use a switch statement
		


		int daynumber = 2;
		switch (daynumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}

// we can use a default clause which works the same was as the else does in an if statement.
// It means "in all other cases"
		
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		default:
			System.out.println("March or later");
		}

// Note that use of the break statement is optional but be careful. They can be useful when used correctly. In the following example, we use a fall through so that several different different case statements do the same thing. Here, if the monthNumber is 1, 2 or 3 then they all display "1st quarter":
// if the monthNumber is 1, it does nothing and falls through to the next case and falls through to the next, until it reaches a break statement. At that point it will exit the switch
		
		int monthNumber = 1;
		switch (monthNumber) {
		case 1:
		case 2:
		case 3:
			System.out.println("1st quarter");
			break;

		case 4:
		case 5:
		case 6:
			System.out.println("2nd quarter");
			break;

		case 7:
		case 8:
		case 9:
			System.out.println("3rd quarter");
			break;

		case 10:
		case 11:
		case 12:
			System.out.println("4th quarter");
			break;

		}

	}

}
