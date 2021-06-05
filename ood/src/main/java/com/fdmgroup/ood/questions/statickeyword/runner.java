package com.fdmgroup.ood.questions.statickeyword;

public class runner {

	public static void main(String[] args) {
		
		double energy = EnergyMatterCalculator.matterToEnergy(100);
		double matter = EnergyMatterCalculator.energyToMatter(energy);
		
		System.out.println("Matter of 100 should equal... " + matter);
		
		Employee.setMinimumWage(9.53);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		employee1.setHourlyWage(1.00);
		employee2.setHourlyWage(2.00);
		employee3.setHourlyWage(20.00);
		
		System.out.println(employee1.getHourlyWage());
		System.out.println(employee2.getHourlyWage());
		System.out.println(employee3.getHourlyWage());

	}

}
