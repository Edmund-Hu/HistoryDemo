package com.Edmund_Homework;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("人员姓名为："+this.name+"，年龄为："+this.age);
	}
	public static void main(String[] args) {
		Person p=new Person("张三",19);
		p.show();
	}
}
