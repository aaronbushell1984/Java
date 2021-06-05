package com.fdmgroup.ood.modelanswers.classesAndObjectsExercises;

public class Memory {

	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	public Memory(String mODEL, double cAPACITY, double sPEED) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		SPEED = sPEED;
	}

	public void storeData(String data) {
		System.out.println("storing "+data);
	}
	
	// getters & setters
	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}

	public double getSPEED() {
		return SPEED;
	}

	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	
	
}
