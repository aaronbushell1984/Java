package com.fdmgroup.ood.questions.mutableandimmutableclasses;

public class MutableAndImmutableClasses {

	public MutableAndImmutableClasses() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Part 1 – Creating mutable classes
//	
//	1.	Create a package called immutableClassesExercise.
//	
//	2.	Create the Trainer and Trainee classes shown in the UML below. These classes will be mutable. 
//	
//	3.	Create getters and setters for all attributes of Trainee
//	
//	4.	Create getters and setters for the name attribute of Trainer.
//	
//	5.	Create the addStream method for Trainer. This should add the String argument to the streamsTaught ArrayList.
//	
//	6.	Create the getAllStreams() method for Trainer. This should return the streamsTaught ArrayList.
//
//			
//	Part 2 – Creating an immutable class
//	
//	1.	Create the immutable class CompletedClass shown in the UML below. Create getters and setters for all variables. 
//			
//	2.	Ensure that the final keyword is used where appropriate and that mutable objects are cloned in the constructor and in getter methods.
//	
//	
//	Part 3 – Verifying immutability
//	
//	1.	Create 3 Trainee objects using values of your choice.
//	
//	2.	Create an ArrayList of Trainee objects and add the 3 trainee objects to it. 
//	
//	3.	Create a Trainer object giving them a name of your choice.
//	
//	4.	Call the Trainer’s addStream() method 3 times to pass in the names of 3 different streams.
//	
//	5.	Create a CompletedClass object passing a String containing a course name, your trainer object and your trainee list into its constructor.
//	
//	6.	Change the value of the week attribute for each of your Trainee objects.
//	
//	7.	Call the getTrainees() method of your CompletedClass object. Loop through the returned ArrayList of Trainees and verify that the week attribute for each of the trainees has not been changed.
//	
//	8.	Call the Trainer’s addStream() method and add the name of a new stream.
//	
//	9.	Call the getTrainer() method of your CompletedClass object. Call the getAllStreams() method on the Trainer object that’s returned. Verify that this still contains only 3 streams.
//
}
