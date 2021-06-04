package com.fdmgroup.ood.passbyvalue;

public class PassByValueDemo {

	public PassByValueDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before swap x = " + x + " y equals " + y);
		swapParameter(x, y);
		System.out.println("After swap x = " + x + " y equals " + y);
		
		Bike fastBike = new Bike(10, 2);
		Bike slowBike = new Bike(1, 4);
		System.out.println("Bike fast slow before swap" + fastBike + slowBike);
		swapReferences(fastBike, slowBike);
		System.out.println("Bike fast slow after swap" + fastBike + slowBike);
		

	}
	// Parameters are copies of the original values
	public static void swapParameter(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	// Up and down cast example also
	public static void swapReferences(Bike bikeone, Bike biketwo) {
		Object temp = bikeone;
		bikeone = biketwo;
		biketwo = (Bike) temp;
	}

}
