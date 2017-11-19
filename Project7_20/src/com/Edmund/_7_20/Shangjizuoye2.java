package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("请输入一个整数");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		if(a % 3 == 0 && a % 5 == 0 && a % 7 == 0){
			System.out.println("该整数能同时被3、5、7整除");
		}else{
			System.out.println("该整数不能同时被3、5、7整除");
		}
	}
	
	
}

	
	
	