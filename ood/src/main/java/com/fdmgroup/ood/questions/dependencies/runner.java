package com.fdmgroup.ood.questions.dependencies;

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
		
		Computer computer1 = new Computer("Dell", drive1, memory1, processor1);
		Computer computer2 = new Computer("Dell", drive2, memory2, processor2);
		
		PowerSource power1 = new PowerSource(24);
		computer1.getPower(power1);
		
		ComputerStore computerStore1 = new ComputerStore("PC World");
		computerStore1.addComputer(computer1);
		computerStore1.addComputer(computer2);
		
		System.out.println(computerStore1.getAllComputers());

	}

}
