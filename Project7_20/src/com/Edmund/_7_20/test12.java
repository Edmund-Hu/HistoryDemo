package com.Edmund._7_20;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������a");
		int a = sc.nextInt();
		System.out.println("����������b");
		int b = sc.nextInt();
		if(a % b == 0|| a + b > 1000){
			System.out.println(a);
		}else{
			System.out.println(b);
		}

	}

}
