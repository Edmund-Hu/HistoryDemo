package com.Edmund_Homework;

public class Manager extends Employee {
	private final String vehicle="Mazda Alxea";

	
	public Manager(double salary, String name, int age, char sex) {
		super(salary, name, age, sex);
		// TODO Auto-generated constructor stub
	}

	
	public String getVehicle() {
		return vehicle;
	}

}
