package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork_test4_7_20 {

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int a , b , c ;
			System.out.println("输入3个整数：");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			int sum = a + b + c;
			int cum = a * b * c;
			float avg = sum / 3.0f ;        //求平均值，注意这里除以3.0f，如改为3或3.0
			System.out.println("a+b+c=" + sum);  //结果会怎样。试分析原因
			System.out.println("a*b*c=" + cum);
			System.out.println("average=" + avg);
	}
	}


