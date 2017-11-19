package com.Edmund_8_11;

public class student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private double score;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String toString(){
		return id+"\t"+name+"\t"+sex+"\t"+age+"\t"+score;
	}
	
	
}
