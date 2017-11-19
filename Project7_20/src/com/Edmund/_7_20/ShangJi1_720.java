package com.Edmund._7_20;

import java.util.Scanner;

public class ShangJi1_720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, t;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		if(x>y){
			t = x;
			x = y;
			y = t;
		}
		if(x>z){
			t = x;
			x = z;
			z = t;
		}
		if(y>z){
			t = y;
			y = z;
			z = t;
		}

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
