package com.fdmgroup.ood.examples.inheritance;

public class Car extends LandVehicle {

	private float horsePower;
	
	public Car(String name, double maxSpeed, int numberOfWheels, float horsePower) {
		super(name, maxSpeed, numberOfWheels);
		this.horsePower = horsePower;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
	}

	public float getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(float horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car [horsePower=" + horsePower + ", toString()=" + super.toString() + "]";
	}

}
