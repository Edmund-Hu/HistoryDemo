package com.Edmund_7_21;

import java.util.Scanner;

public class TotalMoney {
	static int totalMoney;
	public static void totalMoneyInput(){
		System.out.println("��������Ϸ�ܳ��룺��ֻ��Ϊ��������");
		Scanner sc =new Scanner(System.in);
		totalMoney = sc.nextInt();
		if(totalMoney<=0){
			System.out.println("��������������������");
			totalMoneyInput();
		}
	}
}
