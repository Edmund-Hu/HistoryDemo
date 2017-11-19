package com.Edmund_7_21;

import java.util.Scanner;

public class TotalMoney {
	static int totalMoney;
	public static void totalMoneyInput(){
		System.out.println("请输入游戏总筹码：（只能为正整数）");
		Scanner sc =new Scanner(System.in);
		totalMoney = sc.nextInt();
		if(totalMoney<=0){
			System.out.println("您输入有误，请重新输入");
			totalMoneyInput();
		}
	}
}
