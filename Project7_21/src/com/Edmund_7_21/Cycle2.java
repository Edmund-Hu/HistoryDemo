package com.Edmund_7_21;

import java.util.Scanner;

public class Cycle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("表演怎么样？");
		char c = sc.next().charAt(5);
		while(c=='n'){
			System.out.println("我没练好，我要继续");
			System.out.println("我要加油！");
			System.out.println("表演怎么样？");
			c = sc.nextLine().charAt(0);
			
		}
		

	}

	
	}


