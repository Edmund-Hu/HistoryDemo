package com.Edmund_7_22;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入一个正整数");
	
		int num = SC.nextInt();
		int i,j;
		for(i=0,j=num;i<=num&&j>=0;i++,j--){
			
				System.out.println(i+"+"+j+"="+(i+j));
			
		}

	}

}
