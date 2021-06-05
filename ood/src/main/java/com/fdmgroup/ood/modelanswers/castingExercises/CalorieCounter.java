package com.fdmgroup.ood.modelanswers.castingExercises;

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
	
	public void removeHighCalorieFoodsFromBasket(Basket basket, int calories) {
		List<BasketItem> basketItems = basket.getAllItems();
		List<FoodItem> itemsToRemove = new ArrayList<FoodItem>();
		for (BasketItem item : basketItems) {
			if (item instanceof FoodItem) {
				
				FoodItem foodItem = (FoodItem) item;
				if (foodItem.getCalories() > calories) {
					itemsToRemove.add(foodItem);
				}
			}
		}
		for (FoodItem foodItemToRemove : itemsToRemove) {
			BasketItem itemToRemove = (BasketItem) foodItemToRemove;
			basket.removeItem(itemToRemove);
		}
	}
	
}
