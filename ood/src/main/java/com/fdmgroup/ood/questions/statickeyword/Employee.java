package com.fdmgroup.ood.questions.statickeyword;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double hourlyWage;
	private static double minimumWage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		if (hourlyWage < minimumWage) {
			this.hourlyWage = minimumWage;
		} else {
			this.hourlyWage = hourlyWage;			
		}
	}

	public double getMinimumWage() {
		return minimumWage;
	}

	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", hourlyWage=" + hourlyWage + ", minimumWage="
				+ minimumWage + "]";
	}
	
	
	
	
}
