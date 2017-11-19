package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork_test3_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner IN = new Scanner(System.in);
		int x = IN.nextInt();
		double y;
		double y1;
		boolean b;
		boolean b1;
		y = 2.4*x-1/2;
		y1 = x % 2/5 - x;
		b = x>10 && x<100;
		b1 = x>=10 || x<=1;
		System.out.println("y="+y);
		System.out.println("y1="+y1);
		System.out.println("b="+b);
		System.out.println("b1="+b1);
		
	}

}
