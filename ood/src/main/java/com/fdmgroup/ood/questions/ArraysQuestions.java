package com.fdmgroup.ood.questions;

import java.util.Arrays;

public class ArraysQuestions {

	public static void main(String[] args) {
		
//		Section 1 - Arrays
		
//		1.1 Friends array
//		Create an array containing the names of your five best friends.
		String[] bestFriends = {"Luke", "Jack", "Lee", "Malcolm", "Kris"};
				
//		Now do the following with your array:
//		a.	Display the number of friends in the array.
		int numberOfBestFriends = bestFriends.length;
		System.out.println(numberOfBestFriends);
		
//		b.	Display each name in the array on a separate line.
		for (String friend : bestFriends) {
			System.out.println(friend);
		}
		
//		c.	You’re no longer friends with the fifth person in the array. Replace their name with a new friend.
		bestFriends[4] = "Bob";	
		System.out.println(Arrays.toString(bestFriends));
		
//		d.	Sort the array.
		Arrays.sort(bestFriends);
		System.out.println(Arrays.toString(bestFriends));
		
//		e.	Display the first person in the array.
		System.out.println(bestFriends[0]);
		
//		f.	Display the last person in the array.
		System.out.println(bestFriends[4]);
		
//		g.	You’re no longer friends with the second person in the array. Remove their name from the array by replacing it with null.
		bestFriends[1] = null;
		System.out.println(Arrays.toString(bestFriends));
//		
//		1.2 Poker Hand
//		Create an empty array of Strings called pokerHand with 5 elements.
		String pokerHand[] = new String[5];
		System.out.println(Arrays.toString(pokerHand));
//
//		Now do the following with your array.
//
//		1.	Add the String “Queen of hearts” into the first position in your array.
		pokerHand[0] = "Queen of hearts";
		System.out.println(Arrays.toString(pokerHand));
		
//		2.	Add the String “3 of spades” into the second position in your array.
		pokerHand[1] = "3 of spades";
		System.out.println(Arrays.toString(pokerHand));
		
//		3.	Add the String “3 of diamonds” into the third position in your array.
		pokerHand[2] = "3 of diamonds";
		System.out.println(Arrays.toString(pokerHand));
		
//		4.	Add the String “9 of hearts” into the fourth position in your array.
		pokerHand[3] = "9 of hearts";
		System.out.println(Arrays.toString(pokerHand));
		
//		5.	Add the String “6 of clubs” into the fifth position in your array.
		pokerHand[4] = "6 of clubs";
		System.out.println(Arrays.toString(pokerHand));

	}

}
