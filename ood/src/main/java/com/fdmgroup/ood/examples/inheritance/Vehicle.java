package com.fdmgroup.ood.examples.inheritance;

public abstract class Vehicle {

	private String name;
	private double maxSpeed;
	
	public Vehicle(String name, double maxSpeed) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	// abstract method with no code
	public abstract void accelerate();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
