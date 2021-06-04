package com.fdmgroup.ood.strings;

public class Strings {

	public static void main(String[] args) {
		// 1.1 Simple Message - Store a message in a String, and then display that message.
		String message = "Howdy";
		System.out.println(message);
		
		// 1.2 Full Name - Store your first name in a String variable called firstName. Store your second name in another String variable called secondName. Create a third String variable called fullName, it’s value should be the value of the firstName variable followed by a space followed by the value of the lastName variable. Display the value of the fullName variable.
		String firstName = "Aaron";
		String secondName = "Bushell";
		String fullName =  firstName + " " + secondName;
		System.out.println(fullName);

		// 1.3 Personal Message - Store a person’s name in a variable, and print a message to that person. Your message should be simple, such as, “Hello Eric, would you like to learn some Java today?”
		String name = "Eric";
		System.out.println("Hello " + name + ", would you like to learn some Java today?");

		// 1.4 Name operations - Store your name in a String. Now use String methods to display each of the following pieces of information:
		// e.g 	If the name is “Nick” we should see:
		// 4
		// NICK
		// N
		// k
		String myName = "Aaron";
		// •	The length of your name
		System.out.println(myName.length());
		// •	Your name in upper case
		System.out.println(myName.toUpperCase());
		// •	The first letter of your name
		System.out.println(myName.charAt(0));
		// •	The last letter of your name
		int lengthMyName = myName.length();
		System.out.println(myName.charAt(lengthMyName-1));

		// 1.5 Sentence Operations - Create a String which contains the following text: “this is a sentence”. Now use String methods to display each of the following pieces of information:

		String sentence = "this is a sentence";

		// •	Display the position of the first space (should be 4)
		System.out.println(sentence.indexOf(" "));
		// •	Display the position of the last space (should be 9)
		System.out.println(sentence.lastIndexOf(" "));
		// •	Display the position of the first letter x (should be -1)
		System.out.println(sentence.indexOf("x"));
		// •	Display the first 4 characters of the String (should show “this”)
		System.out.println(sentence.substring(0, 4));
		// •	Display the characters of the String from position 10 onwards (should show “sentence”)
		System.out.println(sentence.substring(10));
		// •	Display the characters in positions 5,6,7 & 8 (should show “is a”)
		System.out.println(sentence.substring(5, 9));
		// •	Does the sentence contain the letter “a”? Display true or false.
		System.out.println(sentence.contains("a"));
		// •	Does the sentence contain the letter “x”? Display true or false.
		System.out.println(sentence.contains("x"));
		// •	Add the text “is “ to the start of the String and “?” to the end of the String and display the new value of the String
		String newSentence = "is ".concat(sentence).concat("?");
		System.out.println(newSentence);
		// •	Replace the first letter “t” with the letter “T” and display the new value of the String
		// Changes both!!!
		System.out.println(sentence.replace("t", "T"));
		// Changes first only
		System.out.println(sentence.replaceFirst("t", "T"));
	}

}
