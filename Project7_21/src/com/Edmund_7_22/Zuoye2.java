package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye2 {
//二十一、接收用户输入一个数，判断该数是否为质数
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("请您输入一个整数");
		int num = SC.nextInt();
		int i;
		boolean flag = false;		
		if (num == 2) {
			System.out.println("这个数是质数");
		} else if (num == 0 || num == 1) {
			System.out.println("这个数不是质数，也不是合数");
		} else {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					flag=true;	
				} 

			}
			if(flag){
				System.out.println("这个数不是质数");	
			}else{
				System.out.println("这个数是质数");
			}
		}

	}

}
