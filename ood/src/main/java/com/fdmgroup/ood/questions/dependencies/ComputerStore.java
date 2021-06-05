package com.fdmgroup.ood.questions.dependencies;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
	
	private String name;
	private List<Computer> computers = new ArrayList<>();
	
	public ComputerStore(String name) {
		super();
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}

	public List<Computer> getAllComputers() {
		return computers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComputerStore [name=" + name + ", computers=" + computers + "]";
	}
	
	
	
}
