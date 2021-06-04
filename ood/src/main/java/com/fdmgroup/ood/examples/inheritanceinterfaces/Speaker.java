package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class Speaker implements BatteryPowered {

	private String deviceName;
	
	public Speaker(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	@Override
	public void charge(double amps) {
		System.out.println("charging speaker "+deviceName+" with "+amps+" of current");
	}

	public void makeSound() {
		System.out.println("speaker is making a sound");
	}
	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

}
