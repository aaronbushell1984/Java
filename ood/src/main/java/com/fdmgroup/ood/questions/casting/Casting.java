package com.fdmgroup.ood.questions.casting;

public class Casting {

	public Casting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Part 1 – Setting up
//	
//	These exercises will build on the code you wrote for the Module 10 exercises (Interfaces).
//	Create a package called com.fdmgroup.castingExericses.
//	Copy all the classes and interfaces from the interfacesExercises package into your castingExercises package.
//
//	
//	Part 2 – Downcasting FoodItem objects
//	
//	The following should be written in the main method of your Runner class:
//	
//		1.	Call the getAllLowCalorieFoods() method of your CalorieCounter object. Store the results in an ArrayList<FoodItem> reference called lowCalorieFoods.
//		
//		
//		2.	Loop through the lowCalorieFoods ArrayList. Each item should be cast to either ReadyMeal or Snack as appropriate. 
//		
//		3.	You should print out the name and price of each item. For ReadyMeals you should also print the cuisineType. For Snacks you should also print the fatContent and sugarContent.
//
//
//	Part 3 – Removing high calorie items from the Basket
//		
//		1.	Create a new method in CalorieCounter called removeHighCalorieFoodsFromBasket. The method will take two arguments: A Basket and an int containing the maximum number of calories allowable for an item in the basket.
//		
//		2.	Write the code for the method. The method should identify all the FoodItems objects in the basket and check if they have more than the maximum calories allowable. Where the object’s calories are too high, the method should call the Basket’s removeItem method passing in the object.
//		
//		3.	In the main method of your Runner class, check that your code works by calling the removeHighCalorieFoodsFromBasket() method, passing in your Basket object and the number 500. 
//		
//		4.	Call the basket’s getAllItems() method and loop through the ArrayList that it returns printing out the name of each item. Verify that the list contains a Toy object, a Laptop object, a ReadyMeal object with less than 500 calories and a Snack object with less than 500 calories.

}
