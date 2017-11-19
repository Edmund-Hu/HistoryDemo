package com.Edmund._7_20;

import java.util.Scanner;

public class Zuoye7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.println("输入1个整数：");
		a = input.nextInt();
		if(a % 2 == 0){
			System.out.println(" 偶数");
		}else{
			System.out.println("奇数");
		}
		if(a>0){
			System.out.println(" 正数");
		}else if(a<0)	{
			System.out.println(" 负数");
			}else{
				System.out.println(" 零");
			}
		}

}
