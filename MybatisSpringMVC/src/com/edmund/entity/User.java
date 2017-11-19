package com.edmund.entity;

public class User {
	private int id;
	private String name;
	private int age;
	private String sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(){
		
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User(String name, int age, String sex) {
		//super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String toString(){
		return name+" "+age+" "+sex;
	}
	
}
