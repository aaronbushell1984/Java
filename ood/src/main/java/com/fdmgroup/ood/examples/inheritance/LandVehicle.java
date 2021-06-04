package com.fdmgroup.ood.examples.inheritance;

public abstract class LandVehicle extends Vehicle {

	private int numberOfWheels;

	public LandVehicle(String name, double maxSpeed, int numberOfWheels) {
		super(name, maxSpeed);
		this.numberOfWheels = numberOfWheels;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "LandVehicle [numberOfWheels=" + numberOfWheels + ", toString()=" + super.toString() + "]";
	}
	
	
}
