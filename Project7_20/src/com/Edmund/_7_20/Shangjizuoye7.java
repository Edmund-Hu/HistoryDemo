package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye7 {

	public static void main(String[] args) {
		System.out.println("������һ����λ��");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(num == num*num%100){
			System.out.println(num+" yes "+num+"*"+num+"="+num*num);
		}else{
			System.out.println(num+" no "+num+"*"+num+"="+num*num);
		}
	}

	
	
}
