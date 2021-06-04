package com.fdmgroup.ood.classes;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	
	private final String name;
	
	private List<String> questions;

	public Exam(String name) {
		super();
		this.name = name;
		this.questions = new ArrayList<>();
	}
	
	public boolean addQuestion(String question) {
		return this.questions.add(question);
	}

	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", questions=" + questions + "]";
	}	

}
