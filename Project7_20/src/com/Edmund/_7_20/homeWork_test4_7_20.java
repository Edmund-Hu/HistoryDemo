package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork_test4_7_20 {

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int a , b , c ;
			System.out.println("����3��������");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			int sum = a + b + c;
			int cum = a * b * c;
			float avg = sum / 3.0f ;        //��ƽ��ֵ��ע���������3.0f�����Ϊ3��3.0
			System.out.println("a+b+c=" + sum);  //������������Է���ԭ��
			System.out.println("a*b*c=" + cum);
			System.out.println("average=" + avg);
	}
	}


