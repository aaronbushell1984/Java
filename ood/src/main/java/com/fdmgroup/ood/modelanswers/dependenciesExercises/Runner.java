package com.fdmgroup.ood.modelanswers.dependenciesExercises;

public class Runner {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive("Seagate",2);
		HardDrive drive2 = new HardDrive("Dell",3);
		
		drive2.setUsedSpace(500);
		
		Processor processor1 = new Processor("Intel Xeon",2.93,6);
		Processor processor2 = new Processor("Intel Celeron",2.9,2);
		
	
		Memory memory1 = new Memory("Kingston",4,1600);
		Memory memory2 = new Memory("Corsair",8,1333);
		// 1.2		
		Computer computer1 = new Computer("Dell",drive1, memory1, processor1);
		Computer computer2 = new Computer("Lenovo",drive2, memory2, processor2);
		
		// 1.3
		PowerSource powerSource = new PowerSource();
		powerSource.setWatts(50);
		computer1.getPower(powerSource);

		// 1.4
		ComputerStore computerStore = new ComputerStore("nick's computer shop");
		computerStore.addComputer(computer1);
		computerStore.addComputer(computer2);
		for (Computer computer : computerStore.getAllComputers()) {
			System.out.println(computer.getMODEL());
		}
	}

}
