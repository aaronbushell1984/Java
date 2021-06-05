package com.fdmgroup.ood.modelanswers.dependenciesExercises;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {

	private String name;
	private List<Computer> computers = new ArrayList<Computer>();
	
	public ComputerStore(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}

	public List<Computer> getAllComputers() {
		return computers;
	}
	
	
	
}
