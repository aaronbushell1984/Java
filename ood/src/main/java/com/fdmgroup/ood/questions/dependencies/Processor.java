package com.fdmgroup.ood.questions.dependencies;

public class Processor {
	
	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	public Processor(String model, double speed, int number_of_cores) {
		super();
		MODEL = model;
		SPEED = speed;
		NUMBER_OF_CORES = number_of_cores;
	}
	 
	public void processData(String data) {
		System.out.println("processData " + data);
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getSPEED() {
		return SPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}

	@Override
	public String toString() {
		return "Processor [MODEL=" + MODEL + ", SPEED=" + SPEED + ", NUMBER_OF_CORES=" + NUMBER_OF_CORES + "]";
	}
	
	
	
}
