package com.fdmgroup.ood.questions.dependencies;

public class Computer {

	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;

	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		super();
		MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		PROCESSOR = processor;
	}

	public void turnOn() {
		System.out.println("Computer is on");
	}

	public void turnOff() {
		System.out.println("Computer is off");
	}
	
	public void getPower(PowerSource powersource) {
		double watts = powersource.supplyPower();
		System.out.println(watts + " watts received from power source");
	}

	public String getMODEL() {
		return MODEL;
	}

	@Override
	public String toString() {
		return "Computer [MODEL=" + MODEL + ", hardDrive=" + hardDrive + ", memory=" + memory + ", PROCESSOR="
				+ PROCESSOR + "]";
	}

}
