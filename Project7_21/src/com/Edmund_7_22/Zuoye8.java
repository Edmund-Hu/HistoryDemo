package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye8 {
//二十七、接收用户输入一个数，打印出这个数以内的所有质数
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x = SC.nextInt();
		boolean flag = true;
		if (x == 2) {
			System.out.println("2以内的质数是2");
		} else if (x > 2) {

			for (int i = x; i >1; i--) {
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag = false;
						break;
					}else{
						flag=true;
					}
				}
				if(flag){
					System.out.println(i);
				}
			}
			
		}
	}
}
