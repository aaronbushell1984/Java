package com.fdmgroup.ood.modelanswers.immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

	private String name;
	private List<String> streamsTaught = new ArrayList<String>();
	
	public Trainer(String name) {
		super();
		this.name = name;
	}
	
	public void addStream(String stream) {
		streamsTaught.add(stream);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAllStreams() {
		return streamsTaught;
	}
	
	
	
}
