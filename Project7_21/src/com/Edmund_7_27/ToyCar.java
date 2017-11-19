package com.Edmund_7_27;

public class ToyCar extends Toy{

	public ToyCar(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public final void play(){
		System.out.println("放在地上玩的，做开车状");
		super.play();
	}

}
