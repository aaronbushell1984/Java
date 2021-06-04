package com.fdmgroup.ood.classesdemo;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.ood.classes.Academy;
import com.fdmgroup.ood.classes.Exam;
import com.fdmgroup.ood.classes.Trainee;

public class DemoTrainees {
	
	private static int traineeIdCounter = 0;

	public static void main(String[] args) {
		Academy glasgowAcademy = new Academy("Glasgow");

		Trainee aaron = new Trainee(getNextTraineeIdCounter(), "Aaron");
		System.out.println("Trainee Aaron: " + aaron.getName());
		aaron.setStream("BI");
		aaron.setWeek(2);
		System.out.println(aaron);

		Trainee bill = new Trainee(getNextTraineeIdCounter(), "Bill", "Java");
		System.out.println(bill);

// 		Example of static class methods - Static refernces attributes and methods which have one copy and belong to Class not the instance.
//		double result = Math.tan(12.34);
		
//		access via a static getter
		System.out.println(Trainee.getCompanyName());
		
		glasgowAcademy.addTrainee(aaron);
		glasgowAcademy.addTrainee(bill);
		System.out.println(glasgowAcademy);
		
		Exam javaExam = new Exam("Java");
		javaExam.addQuestion("Question 1");
		javaExam.addQuestion("Question 2");
		javaExam.addQuestion("Question 3");
		
		Exam pythonExam = new Exam("Python");
		pythonExam.addQuestion("Question 1");
		pythonExam.addQuestion("Question 2");
		pythonExam.addQuestion("Question 3");
		
		aaron.addExam(pythonExam);
		
		List<Exam> billsExams = new ArrayList<>();
		billsExams.add(javaExam);
		billsExams.add(pythonExam);
		bill.setExams(billsExams);
		
		System.out.println(glasgowAcademy);

	}
	
	public static int getNextTraineeIdCounter() {
		traineeIdCounter++;
		return traineeIdCounter;
	}

}
