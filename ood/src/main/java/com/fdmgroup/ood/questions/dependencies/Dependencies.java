package com.fdmgroup.ood.questions.dependencies;

public class Dependencies {

	public Dependencies() {
		// TODO Auto-generated constructor stub
	}

	
//	1.1	Setting up
//	
//		Create a package called com.fdmgroup.dependenciesExercises. Copy everything from the classesAndObjectsExercises package.
//
//	
//	1.2	Creating associations
//	
//		1.	Create the Computer class shown in the UML below. 
//			a.	Create getters and setters for all attribures. 
//			b.	The two void methods should just print a simple message.
//	
//		2.	In the main method of your Runner class, create the following Computer objects:
//			a.	computer1
//				i.	model : Dell
//				ii.	hardDrive1, processor1, memory1
//			b.	computer2
//				i.	model : Lenovo
//				ii.	hardDrive2, processor2, memory2
//

//	1.3	Creating a simple dependency
//	
//		1.	Create the PowerSource class shown in the UML below. Create a setter method for the ‘watts’ variable. The supplyPower() method should return the value of the ‘watts’ variable.
//	
//		2.	Create the getPower() method in the Computer class. It should call the supplyPower() method of the PowerSource object that it receives as an argument. It should then print out a simple message such as watts+”watts received from power source”.
//		
//		3.	In the main method of your Runner class, create a PowerSource object. Give its ‘watts’ variable a value. Call computer1’s getPower() method passing in your PowerSource object. Verify that it prints a message containing the correct number of watts.
//	
//	1.4	Creating an aggregation
//	
//		1.	Create the ComputerStore class shown in the UML below:
//			a.	Create a getter and setter for the ‘name’ variable.
//			b.	Don’t create a getter and setter for the ‘computers’ ArrayList
//			c.	Instantiate the ‘computers’ ArrayList within the ComputerStore class.
//			
//		2.	Write the code in the ComputerStore’s methods:
//			a.	addComputer() should simply call the ‘computers’ ArrayList’s add() method passing in the Computer argument.
//			b.	getAllComputers() should return the ‘computers’ ArrayList.
//					
//		3.	In the main method of your Runner class. Create a ComputerStore object. Call addComputer() once for each of the computer objects you created in the previous section. Call getAllComputers() to verify that the computer objects have been added.

}
