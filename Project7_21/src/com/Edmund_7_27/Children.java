package com.Edmund_7_27;

public class Children {
	private String name;
	private int age;
	public Children(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void play(Toy toy){
		toy.play();	
	}
	public void getinfo(Toy toy){
		System.out.println("我是"+this.name+"，我今年"+this.age+"岁，我很喜欢玩"+toy.name);
	}
	
}
