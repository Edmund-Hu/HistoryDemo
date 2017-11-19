package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数，只能为“1”或者“0”");
		int n = input.nextInt();
		System.out.println(n==0?"对不起，指纹识别有问题":"老板您好，请进！");
	}

}
