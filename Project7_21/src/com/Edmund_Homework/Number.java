package com.Edmund_Homework;

public class Number {
	private int n1;
	private int n2;
	public Number(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public int addition(){
		return n1+n2;
	}
	public int subtration(){
		return n1-n2;
	}
	public int multiplicaton(){
		return n1*n2;
	}
	public int division(){
		return n1/n2;
	}
	public static void main(String[] args) {
		Number num=new Number(12, 5);
		System.out.println(num.addition());
		System.out.println(num.subtration());
		System.out.println(num.multiplicaton());
		System.out.println(num.division());
	}
}
