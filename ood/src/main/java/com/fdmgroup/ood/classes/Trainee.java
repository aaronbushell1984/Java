package com.fdmgroup.ood.classes;

import java.util.ArrayList;
import java.util.Collection;

public class Trainee {
	
	// sets a constant - if fixed declare straight away, if dynamic below...
	public static final String COMPANY_NAME = "FDM";
	public final int TRAINEE_ID;
	
	private String name;
	private String stream;
	private int week;
//	this is declared as collection at this point (compile). Could be set to arraylist although we are deferring it here to allow potential any collection later
	private Collection<Exam> exams;
	
	
	// Default constructor to allow assignment of new object without arguments
//	public Trainee() {}
	
	// chaining simpler declaration
	public Trainee(int id, String name) {
		super();
		this.TRAINEE_ID = id;
		this.name = name;
		this.week = 1;
		this.exams = new ArrayList<>();
	}
	
	// THIS OPTIONALLY ALLOWS A TRAINEE TO BE CREATED WITHOUT THE STREAM
	// this replaces code below by chaining with this(id, name)
	public Trainee(int id, String name, String stream) {
		this(id, name); // call constructor above
		this.stream = stream;
	}
//	public Trainee(int id, String name, String stream) {
//		super();
//		this.TRAINEE_ID = id;
//		this.name = name;
//		this.stream = stream;
//		this.week = 1;
//		this.exams = new ArrayList<>();
//	}
	
	
	public boolean addExam(Exam exam) {
		return this.exams.add(exam);
	}
	
	// Example of static getter - not required because public in this case
	public static String getCompanyName() {
		return COMPANY_NAME;
	}
	
	
	// source generate getters an setters
	public String getName() {
		return name;
	}

	public int getTRAINEE_ID() {
		return TRAINEE_ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getWeek() {
		return week;
	}
	
	// validation
	public void setWeek(int week) throws IllegalArgumentException {
		if (this.validateWeek(week)) {
			this.week = week;			
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public Collection<Exam> getExams() {
		return exams;
	}

	public void setExams(Collection<Exam> exams) {
		this.exams = exams;
	}

	// private as do not want the validation edited outside
	private boolean validateWeek(int week) {
		boolean result = false;
		if (week >= 1 && week <= 52) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Trainee [TRAINEE_ID=" + TRAINEE_ID + ", name=" + name + ", stream=" + stream + ", week=" + week
				+ ", exams=" + exams + "]";
	}
	
}
