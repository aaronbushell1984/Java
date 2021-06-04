package com.fdmgroup.ood.inheritance;

public abstract class AirVehicle extends Vehicle {

	private boolean fixedWing;
	
	public AirVehicle(String name, double maxSpeed, boolean fixedWing) {
		
		super(name, maxSpeed);
		this.fixedWing = fixedWing;
	}
	
	public boolean isFixedWing() {
		return fixedWing;
	}

	public void setFixedWing(boolean fixedWing) {
		this.fixedWing = fixedWing;
	}

	@Override
	public String toString() {
		return "AirVehicle [fixedWing=" + fixedWing + ", toString()=" + super.toString() + "]";
	}

}
