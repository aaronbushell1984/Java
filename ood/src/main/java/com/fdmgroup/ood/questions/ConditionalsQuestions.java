package com.fdmgroup.ood.questions;

public class ConditionalsQuestions {

	public static void main(String[] args) {
//		Section 1 - Simple if statements
//		1.1	Alien colours 1
//		Imagine an alien was just shot down in a game. Create a variable called alienColour and assign it a value of 'green', 'yellow', or 'red'.
		String alienColour = "pink";
//
//		Write an if statement to test whether the alien's color is green.
		if (alienColour == "green") {
			System.out.println("The colour is Green you scored 5 points");
		}
//
//		If it is, display a message that the player just earned 5 points.
//		ABOVE
//		Try changing the value of the alienColour variable and check that it only displays the message when the value is green. In all other cases it should display nothing.
//		ABOVE
//
//		1.2	Alien colours 2
//		Create two more if statements to deal with red and yellow:
//
//		Red - display a message that the player just earned 10 points.
		if (alienColour == "red") {
			System.out.println("The colour is Red you scored 10 points");
		}
//		Yellow - display a message that the player just earned 15 points.
		if (alienColour == "yellow") {
			System.out.println("The colour is Yellow you scored 15 points");
		}
//
//		Try changing the value of the alienColour variable and check that the code in the relevant if statement runs.
//		COMPLETE
//
//		1.3	Alien colours 3
//		Merge your 3 if statements from the previous exercise into a single if - else if - else statement.
		if (alienColour == "green") {
			System.out.println("The colour is Green you scored 5 points");
		} else if (alienColour == "red") {
			System.out.println("The colour is Red you scored 10 points");
		} else if (alienColour == "yellow") {
			System.out.println("The colour is Yellow you scored 15 points");
		} else {
			System.out.println("invalid colour");
		}
//
//		You should display an extra message of "invalid colour" if the variable alienColour is not set to red, green or yellow.
//		DONE
//
//		Try changing the value of the alienColour variable and check that the code in the relevant part of the if statement runs.
//		DONE
//
//		1.4	Stages of life
//		Write an if-else if-else statement that determines a person's stage of life. 
//
//		Set a value for the variable age, and then:
		int age = -1;
//		If the person is less than 2 years old, display a message that the person is a baby.
		if (age < 2) {
			System.out.println("You are a baby");
		}
//		If the person is at least 2 years old but less than 4, display a message that the person is a toddler.
		else if (age <= 4 && age >= 2) {
			System.out.println("You are a toddler");
		}
//		If the person is at least 4 years old but less than 13, display a message that the person is a child.
		else if (age < 13 && age >= 4) {
			System.out.println("You are a child");
		}
//		If the person is at least 13 years old but less than 20, display a message that the person is a teenager.
		else if (age < 20 && age >= 13) {
			System.out.println("You are a teenager");
		}
//		If the person is at least 20 years old but less than 65, display a message that the person is a working age adult.
		else if (age < 65 && age >= 20) {
			System.out.println("You are an adult");
		}
//		If the person is age 65 or older, display a message that the person is an pensioner.
		else {
			System.out.println("You are a pensioner");
		}
//
//		 
//		1.5	Tax rates
//		Create an int called salary which will store a person's salary. Write an if - else if - else statement which displays a message showing the person's tax rate.
		int salary = 150001;
//
//		Salaries over £150,000 will display 45%
		if (salary > 150000) {
			System.out.println("45%");
		}
//		Salaries over £50000 up to and including £150,000 will display 40%
		else if (salary > 50000 && salary <= 150000) {
			System.out.println("40%");
		}
//		Salaries over £12,500 up to and including  £50,000 will display 20%
		else if (salary > 12500 && salary <= 50000) {
			System.out.println("20%");
		}
//		Salaries up to and including £12,500 will display 0%
		else {
			System.out.println("0%");
		}
//
//
//
//		Section 2 - More complex conditions
//		2.1 Valid account numbers
//		A valid account number will have 8 digits ranging from 10000000 to 99999999. Create an int called accountNumber and put a number in it. 
		int accountNumber = 36003640;
//
//		Now write an if statement which checks if the account number is valid or not. It should display either "valid account number" or "invalid account number".
//
//		Test your if statements by feeding it valid and invalid account numbers.
		if (accountNumber > 9999999 && accountNumber <= 99999999) {
			System.out.println("Valid Account Number");
		} else {
			System.out.println("Invalid Account Number");
		}
		
//	
//
//		2.2 Airline codes 1
//		A flight code follows the following format:
//
//		LH1234 (Lufthansa)
//		BA5678 (British Airways)
//		FR5432 (Ryanair)
//
//		The first 2 characters are the airline code. 
//		Make a String called flightCode and give it one of the 3 values above.
		String flightCode = "FR5678";
//
//		Write an if statement which checks if the airline code (i.e. the first 2 characters of the flight code) is equal to BA. If it does then display "British Airways" otherwise display "Not British Airways"
		
		if (flightCode.matches("BA(.*)")) {
			System.out.println("British Airways");
		} else {
			System.out.println("Not British Airways");
		}
//
//		2.3  Airline codes 2
//		Alter the condition of your if statement to include the codes for Lufthansa and Ryanair. If the flightCode has one of the airline codes: LH, BA, or FR then display the message "valid airline" otherwise display the message "unrecognised or invalid airline".
//		Do not use else if.
		if (flightCode.matches("BA(.*)") || flightCode.matches("LH(.*)") || flightCode.matches("FR(.*)")) {
			System.out.println("valid airline");
		} else {
			System.out.println("unrecognised or invalid airline");
		}
//
//
//		2.4 Airline codes 3
//		Rewrite your if statement from the previous question so that it displays message "unrecognised or invalid airline" if the flight code doesn't have any of the airline codes: LH, BA, or FR
//		If the code matches any of the 3 codes then the if statement should do nothing.
//		Do not use an else or an else if.
		if (!flightCode.matches("BA(.*)") && !flightCode.matches("LH(.*)") && !flightCode.matches("FR(.*)")) {
			System.out.println("unrecognised or invalid airline");
		}
//
//
//
//		2.5 Valid ID
//		Create 2 boolean variables called validPassport and validDrivingLicence. Set them to either true or false. 
		boolean validPassport = false;
		boolean validDrivingLicence = true;
//
//		Write an if statement which displays "id verified" if either the passport or the driving licence is valid. If neither are valid then display "unable to verify id".
		if (validPassport || validDrivingLicence) {
			System.out.println("id verified");
		} else {
			System.out.println("unable to verify id");
		}
//
//		Try changing the values of validPassport and validDrivingLicence to check that your if statement works properly.
//		DONE
//
//		2.6 Older driver
//		Drivers over 70 need to pass an eye test to keep driving. To test if someone can drive after 70 create the following booleans:
//
//		hasLicence
//		isDead
//		hasPassedEyeTest
		boolean hasLicence = true;
		boolean isDead = false;
		boolean hasPassedEyeTest = true;
		
//
//		Write an if statement that displays the message "can still drive" if the driver has a licence, is not dead and has passed an eye test. In all other situations display "not licenced to drive"
		if (hasLicence && !isDead && hasPassedEyeTest) {
			System.out.println("can still drive");
		} else {
			System.out.println("not licenced to drive");
		}


	}

}
