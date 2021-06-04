package com.fdmgroup.ood.inheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		
		Car carFrank = new Car("Frank", 80, 4, 1800);
		System.out.println(carFrank);
		
		Helicopter helicopterHarold = new Helicopter("Harold", 180, false);
		System.out.println(helicopterHarold);
		
		Jet jetJeremy = new Jet("Jeremy", 550, true);
		System.out.println(jetJeremy);
	}

}
