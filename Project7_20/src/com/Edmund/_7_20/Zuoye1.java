package com.Edmund._7_20;

import java.util.Scanner;
//接收用户输入两个整数，先打印出较大的数，再打印较小的数
public class Zuoye1 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int a , b ;
		System.out.println("输入2个整数：");
		a = input.nextInt();
		b = input.nextInt();
		if(a>b){
			System.out.println(a);
			System.out.println(a);
		}else{
			System.out.println(b);
			System.out.println(a);
		}
	}

}
