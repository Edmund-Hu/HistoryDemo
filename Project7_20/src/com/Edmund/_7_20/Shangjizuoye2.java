package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("������һ������");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		if(a % 3 == 0 && a % 5 == 0 && a % 7 == 0){
			System.out.println("��������ͬʱ��3��5��7����");
		}else{
			System.out.println("����������ͬʱ��3��5��7����");
		}
	}
	
	
}

	
	
	