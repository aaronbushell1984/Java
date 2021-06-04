package com.fdmgroup.ood.inheritance;

public class Helicopter extends AirVehicle {

	public Helicopter(String name, double maxSpeed, boolean fixedWing) {
		super(name, maxSpeed, fixedWing);
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Helicopter [toString()=" + super.toString() + "]";
	}
	
	

}
