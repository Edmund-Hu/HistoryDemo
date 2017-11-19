package com.Edmund._7_20;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入蛋的个数");
		Scanner sc = new Scanner(System.in);
		int badEgg = sc.nextInt();
		if(badEgg<5){
			System.out.println("我要吃掉它们");
		}else{
			System.out.println("我要退货！！");
		
		}
	}

}
