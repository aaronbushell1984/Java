package com.fdmgroup.ood.modelanswers.castingExercises;

public class Laptop implements BasketItem {

	private String name;
	private double price;
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCpuSpeed() {
		return cpuSpeed;
	}
	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public double getMemory() {
		return memory;
	}
	public void setMemory(double memory) {
		this.memory = memory;
	}
	public double getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
	}
	

}
