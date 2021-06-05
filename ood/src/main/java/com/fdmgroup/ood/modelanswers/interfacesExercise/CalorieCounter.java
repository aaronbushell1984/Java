package com.fdmgroup.ood.modelanswers.interfacesExercise;

import java.util.ArrayList;
import java.util.List;

public class CalorieCounter {

	List<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();
	
	public void addLowCalorieFood(FoodItem foodItem) {
		if (foodItem.getCalories() <= 500) {
			lowCalorieFoods.add(foodItem);
		}
	}
	
	public List<FoodItem> getAllLowCalorieFoods(){
		return lowCalorieFoods;
	}
	
}
