package com.fdmgroup.ood.questions.statickeyword;

public class EnergyMatterCalculator {
	
	public final static double SPEED_OF_LIGHT = 29979248;
	
	public static double matterToEnergy(double matter) {
		return matter * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
	}
	
	public static double energyToMatter(double energy) {
		return energy / (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
	}
	
}
