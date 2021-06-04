package com.fdmgroup.ood.classes;

import java.util.ArrayList;

public class Academy {

	public final String academyName;
//	one line construction of arraylist
	private ArrayList<Trainee> trainees; // = new ArrayList<>(50);

	public Academy(String academyName) {
		super();
		this.academyName = academyName;
//	allows amount of trainess to be set dynamically with an argument
		this.trainees = new ArrayList<>(50);
	}

//	custom getters setters declared above generic ones
	public boolean addTrainee(Trainee trainee) {
		return this.trainees.add(trainee); // return the boolean because some lists do not allow duplicates...
	}
	
	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}
//	automatic import adds method to add an array of trainees - need a single trainee addition
	public void setTrainees(ArrayList<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Acedemy [academyName=" + academyName + ", trainees=" + trainees + "]";
	}

}
