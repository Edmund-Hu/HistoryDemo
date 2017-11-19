package com.edmund.entity;

public class Student {
	private int id;
	private String name;
	private int age;
	private Depart depart;
	public Student(){};
	public Student(String name, int age) {
		this.age=age;
		this.name=name;
	}
	public Student(int id,String name, int age) {
		this.age=age;
		this.name=name;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Depart getDepart() {
		return depart;
	}
	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age +"]";
	}
	
	
}
