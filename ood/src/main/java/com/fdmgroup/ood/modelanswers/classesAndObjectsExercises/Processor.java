package com.fdmgroup.ood.modelanswers.classesAndObjectsExercises;

public class Processor {

	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	public Processor(String mODEL, double sPEED, int nUMBER_OF_CORES) {
		super();
		MODEL = mODEL;
		SPEED = sPEED;
		NUMBER_OF_CORES = nUMBER_OF_CORES;
	}

	public void processData(String data) {
		System.out.println("processing "+data);
	}
	
	// getters
	public String getMODEL() {
		return MODEL;
	}

	public double getSPEED() {
		return SPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	
	
	
	
}
