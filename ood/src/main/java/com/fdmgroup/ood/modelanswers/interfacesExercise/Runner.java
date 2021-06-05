package com.fdmgroup.ood.modelanswers.interfacesExercise;

public class Runner {

	public static void main(String[] args) {
		Toy toy = new Toy();
		toy.setName("doll");
		toy.setMaxAge(2);
		toy.setMaxAge(5);
		toy.setPrice(19.99);
		
		Laptop laptop = new Laptop();
		laptop.setName("Dell");
		laptop.setCpuSpeed(2.2);
		laptop.setMemory(8);
		laptop.setHardDrive(1025);
		
		Snack snack1 = new Snack();
		snack1.setName("crisps");
		snack1.setPrice(0.8);
		snack1.setCalories(200);
		snack1.setFatContent(15);
		snack1.setSugarContent(1);
		
		Snack snack2 = new Snack();
		snack2.setName("chocolate");
		snack2.setPrice(0.75);
		snack2.setCalories(550);
		snack2.setFatContent(55);
		snack2.setSugarContent(35);
		
		ReadyMeal readyMeal1 = new ReadyMeal();
		readyMeal1.setName("pizza");
		readyMeal1.setCuisineType("italian");
		readyMeal1.setPrice(1.5);
		readyMeal1.setCalories(1000);
		
		ReadyMeal readyMeal2 = new ReadyMeal();
		readyMeal2.setName("greek salad");
		readyMeal2.setCuisineType("greek");
		readyMeal2.setPrice(2.49);
		readyMeal2.setCalories(450);
		
		Basket basket = new Basket();
		basket.addItem(laptop);
		basket.addItem(toy);
		basket.addItem(snack1);
		basket.addItem(snack2);
		basket.addItem(readyMeal1);
		basket.addItem(readyMeal2);
		
		System.out.println("viewing items in basket:");
		for (BasketItem basketItem : basket.getAllItems()) {
			System.out.println(basketItem.getName());
		}
		
		basket.removeItem(snack2);
		
		System.out.println("viewing items in basket after chocolate removed:");
		for (BasketItem basketItem : basket.getAllItems()) {
			System.out.println(basketItem.getName());
		}
		
		CalorieCounter calorieCounter = new CalorieCounter();
		
		calorieCounter.addLowCalorieFood(snack1);
		calorieCounter.addLowCalorieFood(snack2);
		calorieCounter.addLowCalorieFood(readyMeal1);
		calorieCounter.addLowCalorieFood(readyMeal2);
//		calorieCounter.addLowCalorieFood(toy);  - compile error as expected
		
		System.out.println("viewing calories in low calorie foods:");
		for (FoodItem foodItem : calorieCounter.getAllLowCalorieFoods()) {
			System.out.println(foodItem.getCalories());
		}
		
	}

}
