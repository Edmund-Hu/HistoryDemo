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
		System.out.println("����"+this.name+"���ҽ���"+this.age+"�꣬�Һ�ϲ����"+toy.name);
	}
	
}
