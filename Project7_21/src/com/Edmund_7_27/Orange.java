package com.Edmund_7_27;

public class Orange extends Fruit{

	public Orange(String shape, String name, String place) {
		super(shape, name, place);
	}
	public  void eat() {
		super.eat();
		System.out.println("橘子是直接剥皮，然后一瓣一瓣的吃");
		
	}

}
