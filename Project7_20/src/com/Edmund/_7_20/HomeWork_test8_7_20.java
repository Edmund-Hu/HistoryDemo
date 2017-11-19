package com.Edmund._7_20;

import java.util.Scanner;

public class HomeWork_test8_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数a");
		int a = sc.nextInt();
		System.out.println("请输入整数b");
		int b = sc.nextInt();
		System.out.println(a>b?(a = a - b):(a = a + b));
	}

}
