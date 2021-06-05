package com.fdmgroup.ood.modelanswers.immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;

public final class CompletedClass {

	private final String SUBJECT;
	private final Trainer TRAINER;
	private final List<Trainee> TRAINEES;
	
	public CompletedClass(String subject, Trainer trainer, List<Trainee> trainees) {
		super();
		SUBJECT = subject;

		// deep clone trainees
		TRAINEES = new ArrayList<Trainee>();
		for (Trainee trainee : trainees) {
			Trainee clonedTrainee = new Trainee(trainee.getName(), trainee.getStream(), trainee.getWeek());
			TRAINEES.add(clonedTrainee);
		}
		
		// deep clone trainer
		TRAINER = new Trainer(trainer.getName());
		List<String> streams = trainer.getAllStreams();
		for (String stream : streams) {
			TRAINER.addStream(stream);
		}
		
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public Trainer getTRAINER() {
		// deep clone trainer
		Trainer clonedTrainer = new Trainer(TRAINER.getName());
		List<String> streams = TRAINER.getAllStreams();
		for (String stream : streams) {
			clonedTrainer.addStream(stream);
		}
		return clonedTrainer;
	}
	
	public List<Trainee> getTRAINEES() {
		// deep clone trainees
		List<Trainee> clonedTrainees = new ArrayList<Trainee>();
		for (Trainee trainee : TRAINEES) {
			Trainee clonedTrainee = new Trainee(trainee.getName(), trainee.getStream(), trainee.getWeek());
			clonedTrainees.add(clonedTrainee);
		}
		return clonedTrainees;
	}
	
	
	
}
