package com.fdmgroup.ood.questions.classesandobjects;

public class runner {

	public static void main(String[] args) {
		
		HardDrive drive1 = new HardDrive("Seagate", 2);
		HardDrive drive2 = new HardDrive("Dell", 3);
		
		// added to string method to print out attributes
		System.out.println(drive1.toString());
		System.out.println(drive2.toString());
		
		drive2.setUsedSpace(50);
		System.out.println(drive2.getUsedSpace());
		
		Processor processor1 = new Processor("Intel Xeon", 2.9, 6);
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		
		System.out.println(processor1.toString());
		System.out.println(processor2.toString());
		
		Memory memory1 = new Memory("Kingston", 4, 1600);
		Memory memory2 = new Memory("Corsair", 8, 1333);
		
		System.out.println(memory1.toString());
		System.out.println(memory2.toString());

	}

}
