package com.Edmund_7_27;

public class Animal {
	private String name;
	private int weight ;
	private int speed;
	public Animal(String name, int weight, int speed){
		this.name = name;
		this.weight =weight;
		this.speed = speed;
	}
	
	public void getinfo(){
		System.out.println("我是："+name+"我的体重是："+weight+"我的奔跑速度是："+speed);
	}
	
	public void gethabbit(){
		System.out.println("我喜欢吃肉");
	}
}
