package com.fdmgroup.ood.inheritance;

public class Jet extends AirVehicle {

	public Jet(String name, double maxSpeed, boolean fixedWing) {
		super(name, maxSpeed, fixedWing);
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Jet [toString()=" + super.toString() + "]";
	}	
}
