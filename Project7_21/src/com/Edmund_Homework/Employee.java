package com.Edmund_Homework;

public class Employee extends Role {
	private double salary;
	 static String ID;
	public Employee() {

	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getID() {
		return ID;
	}

	public static void setID(String iD) {
		ID = iD;
	}

	public Employee(double salary,String name, int age, char sex) {
		super(name,age,sex);
		this.salary = salary;
	}
	 public void play(){
		 System.out.println("I am paly method of Employee");
	 }
	 public final void sing(){
		 System.out.println("I am sing method of Employee");
	 }
} 
