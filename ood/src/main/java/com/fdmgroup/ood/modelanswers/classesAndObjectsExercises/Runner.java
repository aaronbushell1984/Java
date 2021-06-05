package com.fdmgroup.ood.modelanswers.classesAndObjectsExercises;

public class Runner {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive("Seagate",2);
		HardDrive drive2 = new HardDrive("Dell",3);
		
		drive2.setUsedSpace(500);
		
		System.out.println(drive1.getMODEL()+", "+drive1.getCAPACITY()+", "+drive1.getUsedSpace());
		System.out.println(drive2.getMODEL()+", "+drive2.getCAPACITY()+", "+drive2.getUsedSpace());

		
		Processor processor1 = new Processor("Intel Xeon",2.93,6);
		Processor processor2 = new Processor("Intel Celeron",2.9,2);
		
		System.out.println(processor1.getMODEL()+", "+processor1.getMODEL()+", "+processor1.getNUMBER_OF_CORES());
		System.out.println(processor2.getMODEL()+", "+processor2.getMODEL()+", "+processor2.getNUMBER_OF_CORES());

		
		Memory memory1 = new Memory("Kingston",4,1600);
		Memory memory2 = new Memory("Corsair",8,1333);
		
		System.out.println(memory1.getMODEL()+", "+memory1.getCAPACITY()+", "+memory1.getUsedSpace()+", "+memory1.getSPEED());
		System.out.println(memory2.getMODEL()+", "+memory2.getCAPACITY()+", "+memory2.getUsedSpace()+", "+memory2.getSPEED());
		
		drive1.setUsedSpace(50);
		System.out.println("drive1's used space: "+drive1.getUsedSpace());
	}

}
