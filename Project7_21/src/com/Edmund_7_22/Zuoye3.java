package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye3 {
//二十二、循环接收用户输入n个数，到用户输入0为止，打印出用户输入了多少个正数，多少个负数，多少个奇数，多少个偶数
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		int num = 1;
		int positiveCount = 0;
		int negetiveCount = 0;
		int evenCount = 0;
		int oddCount = 0;
		while (num != 0) {
			System.out.println("请您输入一个整数");
			num = SC.nextInt();
			if (num != 0) {
				if (num > 0) {

					positiveCount += 1;
				} else if (num < 0) {
					negetiveCount += 1;
				}
				if (num % 2 == 0) {
					evenCount += 1;
				} else {
					oddCount += 1;
				}

			}
		}
			System.out.println("用户输入的正数个数为：" + positiveCount);
			System.out.println("用户输入的负数个数为：" + negetiveCount);
			System.out.println("用户输入的偶数个数为：" + evenCount);
			System.out.println("用户输入的奇数个数为：" + oddCount);
		
	}
	
}
