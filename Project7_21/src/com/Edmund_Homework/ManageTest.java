package com.Edmund_Homework;

public class ManageTest {

	public static void main(String[] args) {
		Employee e= new Employee(3000, "Alex", 22,'��');
		Manager m=new Manager(10000, "Edmund", 26,'��');
		e.play();
		m.play();
		m.sing();
	}

}
