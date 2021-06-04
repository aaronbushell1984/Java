package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class PortableLamp implements BatteryPowered, Lamp {

	private String deviceName;
	
	public PortableLamp(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	@Override // inherited from Lamp interface
	public void produceLight(String locationName) {
		System.out.println("lighting up "+locationName+" using portable lamp "+deviceName);
	}

	@Override // inherited from BatteryPowered interface
	public void charge(double amps) {
		System.out.println("charging portable lamp "+deviceName+" with "+amps+" of current");
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}



}
