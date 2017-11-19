package com.Edmund_Homework;

public class ThreeConstructor {
	public ThreeConstructor(int a,int b){
		System.out.println(this.max(a, b));
	}
	public ThreeConstructor(double a,double b,double c){
		System.out.println(this.multi(a, b, c));
	}
	public ThreeConstructor(String a,String b){
	System.out.println(this.compare(a, b));
}
	public int max(int a,int b){
		return Math.max(a, b);
	}
	public double multi(double a,double b,double c){
		return a*b*c;
	}
	public boolean compare(String a,String b){
		if(a.equals(b)){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		ThreeConstructor  tc1=new ThreeConstructor(2, 5);
		ThreeConstructor  tc2=new ThreeConstructor(2.0, 5.0,3.0);
		ThreeConstructor  tc3=new ThreeConstructor("12", "23");
	
	}
	
}
