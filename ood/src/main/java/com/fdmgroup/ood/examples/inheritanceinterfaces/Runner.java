package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class Runner {

	public static void main(String[] args) {
		Tablet tablet = new Tablet("iPad");
		Speaker speaker = new Speaker("x-mini");

		UsbCharger usbCharger = new UsbCharger(2.5);
		
		tablet.connectToUsb();
		speaker.connectToUsb();
		
		usbCharger.supplyPower(tablet);
		usbCharger.supplyPower(speaker);
		
		System.out.println("someElectricalConstant is: "+Tablet.someElectricalConstant);
		System.out.println("someElectricalConstant is: "+Speaker.someElectricalConstant);
		System.out.println("someElectricalConstant is: "+BatteryPowered.someElectricalConstant);

		double watts = BatteryPowered.calculateWatts(2.5, 3);
		System.out.println("watts are: "+watts);
		
		// multiple inheritance example
		System.out.println("\nMultiple Inheritance example: \n");
		PortableLamp portableLamp = new PortableLamp("LE");
		usbCharger.supplyPower(portableLamp);
		
		Room room = new Room("bedroom");
		room.lightRoom(portableLamp);
		
		
	}

}
