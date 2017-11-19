package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye4 {
//二十三、循环接收用户输入n个数，到用户输入0为止，打印出这些数的平均值
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		int num = 1;
		double sum = 0;
		int count = 0;
		double avg = 0;
	
		while (num != 0) {
			System.out.println("请您输入一个整数");
			num = SC.nextInt();
			if(num!=0){
				sum=sum+num;
				count++;
			}

			}
		avg = sum/count;
		
		System.out.println(avg);
		}
		
		
	}
	

	


