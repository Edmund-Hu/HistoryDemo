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
		System.out.println("���ǣ�"+name+"�ҵ������ǣ�"+weight+"�ҵı����ٶ��ǣ�"+speed);
	}
	
	public void gethabbit(){
		System.out.println("��ϲ������");
	}
}
