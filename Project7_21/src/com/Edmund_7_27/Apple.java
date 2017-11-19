package com.Edmund_7_27;

public class Apple extends Fruit{

	public Apple(String shape, String name, String place) {
		super(shape, name, place);	
	}
	public void eat(){
		super.eat();
		System.out.println("苹果一般需要先削皮再吃，切着吃更爽哦");
	}

}
