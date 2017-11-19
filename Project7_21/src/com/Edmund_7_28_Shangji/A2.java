package com.Edmund_7_28_Shangji;

public class A2 {
	public void func1(int a){
		System.out.println(a);
	}
	
	public void func1(int a, int b){
		System.out.println(a+b);
	}
	
	public void func1(String b){
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		A2 a2=new A2();
		a2.func1(2);
		a2.func1(2,4);
		a2.func1("Java");
	}
}
