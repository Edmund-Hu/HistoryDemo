package com.Edmund_7_27;

public class Banala extends Fruit {

	public Banala(String shape, String name, String place) {
		super(shape, name, place);
	}
	public void eat(){
		super.eat();
		System.out.println("香蕉需要剥皮后再吃，一般不用切");
	}

}
