package com.Edmund_Homework;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("��Ա����Ϊ��"+this.name+"������Ϊ��"+this.age);
	}
	public static void main(String[] args) {
		Person p=new Person("����",19);
		p.show();
	}
}
