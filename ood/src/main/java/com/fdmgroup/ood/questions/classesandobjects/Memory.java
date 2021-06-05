package com.fdmgroup.ood.questions.classesandobjects;

public class Memory {
	
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	public Memory(String model, double capacity, double speed) {
		super();
		MODEL = model;
		CAPACITY = capacity;
		SPEED = speed;
	}
	
	public void storeData(String data) {
		System.out.println("storeData " + data);
	}

	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}

	public double getSPEED() {
		return SPEED;
	}

	@Override
	public String toString() {
		return "Memory [MODEL=" + MODEL + ", CAPACITY=" + CAPACITY + ", usedSpace=" + usedSpace + ", SPEED=" + SPEED
				+ "]";
	}
	
	
}
