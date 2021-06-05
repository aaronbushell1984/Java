package com.fdmgroup.ood.modelanswers.staticKeywordExercises;

public class EnergyMatterCalculator {

	public final static double speedOfLight = 299792458 ;
	
	public static double matterToEnergy(double matter) {
		return matter * speedOfLight * speedOfLight;
	}
	
	public static double energyToMatter(double energy) {
		return energy / (speedOfLight * speedOfLight);
	}
	
}
