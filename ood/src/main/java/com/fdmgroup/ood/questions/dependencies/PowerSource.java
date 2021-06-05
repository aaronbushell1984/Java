package com.fdmgroup.ood.questions.dependencies;

public class PowerSource {
	
	double watts;

	public PowerSource(double watts) {
		super();
		this.watts = watts;
	}
	
	public double supplyPower() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}
	
	
	
}
