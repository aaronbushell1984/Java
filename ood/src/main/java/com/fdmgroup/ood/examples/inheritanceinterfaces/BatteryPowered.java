package com.fdmgroup.ood.examples.inheritanceinterfaces;

public interface BatteryPowered {

	// this attribute is public, final and static even though those keywords are not used
	double someElectricalConstant = 2.3534;
	
	// this method is public and abstract even though neither keyword is used
	void charge(double amps);

	// abstract getter and setter methods can be declared in an interface
	void setDeviceName(String deviceName);
	String getDeviceName();
	
	// default method is public even though the keyword is not used
	default void connectToUsb() {
		System.out.println("connecting "+getDeviceName()+" to usb cable");
	}
	
	// static method is public even though the keyword is not used
	static double calculateWatts(double amps, int volts){
		return amps * volts;
	}

}
