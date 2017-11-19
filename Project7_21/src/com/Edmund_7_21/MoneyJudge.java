package com.Edmund_7_21;

import java.util.Scanner;

public class MoneyJudge {
	static int  userMoney;
	public void moneyInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入所押筹码:" + "    " + "提示：您目前的总筹码为："
				+ TotalMoney.totalMoney);
		userMoney = sc.nextInt();
		if (userMoney > TotalMoney.totalMoney) {
			System.out.println("您的筹码不够，请重新输入：");
			moneyInput();
		}else{
			//return userMoney;
		}
	}
}
 