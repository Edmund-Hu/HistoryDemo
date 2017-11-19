package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("请输入一个整数");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		if(a % 2 == 0){
			System.out.println("even 偶数");
		}else{
			System.out.println("odd 奇数");
		}
	}

}
