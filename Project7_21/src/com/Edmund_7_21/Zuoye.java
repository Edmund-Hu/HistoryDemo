package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
