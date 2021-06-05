package com.fdmgroup.ood.modelanswers.staticKeywordExercises;

public class Runner {

	public static void main(String[] args) {
		double energy = EnergyMatterCalculator.matterToEnergy(100);
		double matter = EnergyMatterCalculator.energyToMatter(energy);
		
		System.out.println("matter is "+matter);
		
		Employee.setMinimumWage(9.53);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		employee1.setHourlyWage(7.5);
		employee2.setHourlyWage(5.99);
		employee3.setHourlyWage(15.9);
		
		System.out.println("employee 1's wage is "+employee1.getHourlyWage());
		System.out.println("employee 2's wage is "+employee2.getHourlyWage());
		System.out.println("employee 3's wage is "+employee3.getHourlyWage());
	}

}
