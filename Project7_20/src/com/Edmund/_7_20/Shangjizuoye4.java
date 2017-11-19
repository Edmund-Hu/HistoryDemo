package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个月份和年份");
		Scanner sc = new Scanner(System.in);
		int month =sc.nextInt();
		int year = sc.nextInt();
		switch(month){
		case 1:
			System.out.println(month+"月天数为31天" );
			break;
		case 2:
			if(year%4 ==0 && year%100 !=0||year%400==0){
			System.out.println(month+"月天数为29天" );
			break;
			}else{
				System.out.println(month+"月天数为28天" );
				break;	
			}
		case 3:
			System.out.println(month+"月天数为31天" );
			break;
		case 4:
			System.out.println(month+"月天数为30天" );
			break;
		case 5:
			System.out.println(month+"月天数为31天" );
			break;
		case 6:
			System.out.println(month+"月天数为30天" );
			break;
		case 7:
			System.out.println(month+"月天数为31天" );
			break;
		case 8:
			System.out.println(month+"月天数为31天" );
			break;
		case 9:
			System.out.println(month+"月天数为30天" );
			break;
		case 10:
			System.out.println(month+"月天数为31天" );
			break;
		case 11:
			System.out.println(month+"月天数为30天" );
			break;
		case 12:
			System.out.println(month+"月天数为31天" );
			break;
		
		}
	}

}
