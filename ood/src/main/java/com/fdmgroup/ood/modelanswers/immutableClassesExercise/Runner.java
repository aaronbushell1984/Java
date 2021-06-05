package com.fdmgroup.ood.modelanswers.immutableClassesExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee("John","Java",3);
		Trainee trainee2 = new Trainee("Jane","C#",5);
		Trainee trainee3 = new Trainee("Bob","Testing",4);
		
		List<Trainee> trainees = new ArrayList<Trainee>(Arrays.asList(trainee1,trainee2,trainee3));
		
		Trainer trainer = new Trainer("Nick");
		trainer.addStream("Java");
		trainer.addStream("Techops");
		trainer.addStream("Testing");
		
		CompletedClass completedClass = new CompletedClass("SQL",trainer,trainees);
		
		// changing trainee values 
		trainee1.setWeek(4);
		trainee2.setWeek(6);
		trainee3.setWeek(5);
		
		// verifying that trainee values inside completed class haven't been changed:
		System.out.println("In the completed class, trainee weeks are as follows:");
		for (Trainee trainee : completedClass.getTRAINEES()) {
			System.out.println(trainee.getName()+" is in week "+trainee.getWeek());
		}
		
		// changing trainer values
		trainer.addStream("Data engineering");
		
		// verifying that the trainer values inside completed class haven't been changed:
		Trainer trainerFromCompletedClass = completedClass.getTRAINER();
		System.out.println("In the completed class, trainer "+trainerFromCompletedClass.getName()+" trains the following streams:");
		for (String stream : trainerFromCompletedClass.getAllStreams()) {
			System.out.println(stream);
		}

	}

}
