package com.Edmund_7_27;

public class CaculateScore {
	public double java;
	public double english;
	public double math;
	
	public CaculateScore(double java,double english,double math){
		this.java=java;
		this.english=english;
		this.math= math;
	}
	
	public double sum(){
		return java+english+math;
	}
	
	public double avg(){
		return sum()/3;
	}
	
	public void showSum(){
		System.out.println(this.sum());
	}
	
	public void showAvg(){
		System.out.println(this.avg());
	}
}
