package com.Edmund_7_27;

import java.util.Scanner;

public class Student_Zuoye {
	private String name;
	private double score;
	
	public Student_Zuoye(String name,double score){
		this.name=name;
		this.score=score;
	}
	
	public String getName(){
		return this.name;
	}
	public Double getScore(){
		return this.score;
	}
	
	public void setName(String name){
		 this.name=name;
	}
	public void setScore(double score){
		 this.score=score;
	}
	public void print() {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入姓名和成绩");
		name=sc.next();
		score=sc.nextDouble();
		setName(name);
		setScore(score);
		System.out.println(name+"的成绩是"+score);
		
	}
	
/*	public static void main(String[] args) {
		Student_Zuoye student= new Student_Zuoye("李四", 88);
		student.print();
	}*/
}
