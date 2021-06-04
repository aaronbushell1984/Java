package com.fdmgroup.ood.questions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsQuestions {

	public static void main(String[] args) {
		
//		Section 2 – ArrayLists
		
//		2.1 Shopping basket
//		Create an ArrayList of type String and call it shoppingBasket.
		ArrayList<String> shoppingBasket = new ArrayList<>();
		
//		Now do the following with your ArrayList:
//		1.	Add the following 5 items into your shopping basket one by one: milk, cereals, apples, oranges, bread
		shoppingBasket.add("milk");
		shoppingBasket.add("cereals");
		shoppingBasket.add("apples");
		shoppingBasket.add("oranges");
		shoppingBasket.add("bread");
		System.out.println(shoppingBasket);
		
//		2.	Display the number of items in the shopping basket.
		System.out.println(shoppingBasket.size());
		
//		3.	Display the first item in the shopping basket.
		System.out.println(shoppingBasket.get(0));
		
//		4.	Display the 5th item in the shopping basket.
		System.out.println(shoppingBasket.get(4));
		
//		5.	Remove bread from the shopping basket then display the number of items in the basket.
		shoppingBasket.remove(4);
		System.out.println(shoppingBasket.size());
		
//		6.	Remove the third item from the shopping basket. Now display the names of all items left in the basket. (should display milk, cereals & oranges)
		shoppingBasket.remove(2);
		System.out.println(shoppingBasket);
		
//		7.	Add the following 3 items into the basket: potatoes, olive oil, chicken
		shoppingBasket.add("potatoes");
		shoppingBasket.add("olive oil");
		shoppingBasket.add("chicken");
		
//		8.	Sort the basket then display the first item and the last item. (should be cereals & potatoes) 
		shoppingBasket.sort(null);
		System.out.println(shoppingBasket.get(0) + " " + shoppingBasket.get(shoppingBasket.size()-1));
//
//		2.2 Salaries	
//		Create an ArrayList of type Integer and call it salaries.
		ArrayList<Integer> salaries = new ArrayList<>();
		
//		Now do the following with your ArrayList:
//		1.	Add the following numbers into salaries: 75000, 25000, 42000, 30000, 55000, 42000, 39000
		salaries.add(7500);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
//		2.	Without sorting the salaries show the following information:
//		a.	The highest salary
		System.out.println(Collections.max(salaries));
		
//		b.	The lowest salary
		System.out.println(Collections.min(salaries));
		
//		c.	The number of people earning 42000 
		System.out.println(Collections.frequency(salaries, 42000));
		
//		3.	Sort the salaries and display the median salary (i.e. the one in the middle)
		salaries.sort(null);
		System.out.println(salaries);
		System.out.println(salaries.get(salaries.size()/2));
		
//		4.	Reverse the salaries then display the first and last items.
		Collections.reverse(salaries);
		System.out.println(salaries);
		System.out.println(salaries.get(0) + " " + salaries.get(salaries.size()-1));
	}

}
