package com.Edmund_7_21;

import java.util.Scanner;

public class MoneyJudge {
	static int  userMoney;
	public void moneyInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("��������Ѻ����:" + "    " + "��ʾ����Ŀǰ���ܳ���Ϊ��"
				+ TotalMoney.totalMoney);
		userMoney = sc.nextInt();
		if (userMoney > TotalMoney.totalMoney) {
			System.out.println("���ĳ��벻�������������룺");
			moneyInput();
		}else{
			//return userMoney;
		}
	}
}
 