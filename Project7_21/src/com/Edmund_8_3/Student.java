package com.Edmund_8_3;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double score;

	public Student(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {
		if(id>s.getId()){
			return -1;
		}else if(id<s.getId()){
			return 1;
		}else{
		return 0;
		}
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	public String toString(){
		return id+","+name+","+score;
	}
	
	

}
