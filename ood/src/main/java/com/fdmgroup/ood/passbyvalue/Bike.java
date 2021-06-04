package com.fdmgroup.ood.passbyvalue;

public class Bike {
	public int numberOfGears;
	public int numberOfWheels;
	
	public Bike(int numberOfGears, int numberOfWheels) {
		super();
		this.numberOfGears = numberOfGears;
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Bike [numberOfGears=" + numberOfGears + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
}
