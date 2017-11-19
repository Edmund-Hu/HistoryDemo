package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye10 {
	public static void main(String[] args) {
		

	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	if(a>0){
	int i,b=1;
		for(i=a;i>=1;i--){
			b= b*i;
		if(i==1){
			System.out.print(i);
		}else	System.out.print(i+"*");
		}
		System.out.println("="+b);
		}
	}
	
}

