package com.fdmgroup.ood.examples.inheritanceinterfaces;

public class Room {

	private String name;

	public Room(String name) {
		super();
		this.name = name;
	}

	public void lightRoom(Lamp lamp) {
		lamp.produceLight(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
