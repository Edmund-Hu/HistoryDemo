package com.Edmund._7_20;

import java.util.Scanner;
//接收用户输入三个整数，打印出中间大小值的数
public class Zuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a , b ,c ,max, min;
		System.out.println("输入3个整数：");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a>b){
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		if(max<c){
			System.out.println(max);
		}else if(min>c){
			System.out.println(min);
		}else{
			System.out.println(c);
		}
	}


}
