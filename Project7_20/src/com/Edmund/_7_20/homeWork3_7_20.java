package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork3_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = input.nextInt();
		System.out.println(a%2==0?"这个数是偶数":"这个数是奇数 ");
		System.out.println(a<0?"这个数是负数":"这个数是非负数 ");
		System.out.println(a<0?"这个数是负数":a==0?"这个数是零":"这个数是正数");
	}

}
