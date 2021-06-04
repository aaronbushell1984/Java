package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class Tablet implements BatteryPowered {

	private String deviceName;
	
	public Tablet(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	@Override
	public void charge(double amps) {
		System.out.println("charging tablet "+deviceName+" with "+amps+" of current");
	}
	
	public void displayApp() {
		System.out.println("displaying an app");
	}
	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

}
