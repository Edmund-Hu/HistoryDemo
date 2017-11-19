package com.Edmund_7_27;

public class Children_test {

	public static void main(String[] args) {
		Children child= new Children("Alex", 12);
		ToyCar car = new ToyCar("玩具汽车", "红色");
		ToyPlane plane = new ToyPlane("玩具飞机", "白色");
		child.getinfo(car);
		child.play(car);
		child.play(plane);
				
		

	}

}
