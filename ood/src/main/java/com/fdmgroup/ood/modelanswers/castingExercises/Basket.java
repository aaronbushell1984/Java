package com.fdmgroup.ood.modelanswers.castingExercises;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<BasketItem> basketItems = new ArrayList<BasketItem>();
	
	public void addItem(BasketItem basketItem) {
		basketItems.add(basketItem);
	}
	
	public void removeItem(BasketItem basketItem) {
		basketItems.remove(basketItem);
	}
	
	public List<BasketItem> getAllItems(){
		return basketItems;
	}
	
}
