package com.Edmund._7_20;

import java.util.Scanner;

public class Zuoye5 {	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a , b ;
		System.out.println("输入2个整数：");
		a = input.nextInt();
		b = input.nextInt();
		if(a>b){
			System.out.println(a-b);
		
		}else{
			System.out.println(b-a);

		}
	}
}
