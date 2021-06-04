package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class UsbCharger {

	private double amps;
	
	public UsbCharger(double amps) {
		super();
		this.amps = amps;
	}

	public void supplyPower(BatteryPowered batteryPowered) {
		batteryPowered.charge(amps);
	}
	
	public double getAmps() {
		return amps;
	}
	
	public void setAmps(double amps) {
		this.amps = amps;
	}
	
}
