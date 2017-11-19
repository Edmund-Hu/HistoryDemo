package com.Edmund._7_20;

import java.util.Scanner;

public class Homework_test7_7_20 {

	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a , b; 
		System.out.print("a = ");
		a = input.nextInt();
		System.out.print("b = ");
		b = input.nextInt();
		
		String s = a==b? "等于" : a>b?"大于":"小于"; 
		System.out.println("a " + s + " b");
}

	
}
