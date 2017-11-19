package com.Edmund._7_20;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Shangjizuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		double x =sc.nextDouble();
		double f = 0;
		if(x<0){
			f = 2 * x+5;
		}else if (x>=0 && x<=10){
			f = x*x-x+3;
		}else if (x>10){
			f = x*x*x-7*x;
		}
		System.out.println("f="+f);
	}
	

}
