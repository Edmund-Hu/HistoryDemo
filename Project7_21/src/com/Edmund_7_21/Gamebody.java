package com.Edmund_7_21;

import java.util.Random;

public class Gamebody {
	static String a = "n";

	public static void cyclegame() {
		System.out.println("����ע��(1 ѺС��2 Ѻ��3Ѻ����)");
		InputJudge input = new InputJudge();
		input.choiceInput();

		String userCh = "";

		switch (input.userChoice) {
		case 1:
			userCh = "С";
			break;
		case 2:
			userCh = "��";
			break;
		case 3:
			userCh = "����";
			break;
		}
		MoneyJudge moneyJudge = new MoneyJudge();
		moneyJudge.moneyInput();

		// �����������
		Random r = new Random();
		int num1 = r.nextInt();
		int num2 = r.nextInt();
		int num3 = r.nextInt();
		int absnum1 = Math.abs(num1);
		int absnum2 = Math.abs(num2);
		int absnum3 = Math.abs(num3);
		int s1 = absnum1 % 6 + 1;
		int s2 = absnum2 % 6 + 1;
		int s3 = absnum3 % 6 + 1;
		// �ж�ҡɫ�ӵĽ�������
		if (s1 == s2 && s2 == s3) {
			if (input.userChoice == 3) {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  ����" + "  ��Ѻ��"
						+ userCh + "  ��Ӯ��" + MoneyJudge.userMoney * 36);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 36;
			} else {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  ����" + "  ��Ѻ��"
						+ userCh + "  ������" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		} else if (s1 + s2 + s3 <= 10) {
			if (input.userChoice == 1) {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  С" + "  ��Ѻ��"
						+ userCh + "  ��Ӯ��" + MoneyJudge.userMoney * 2);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 2;
			} else {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  С" + "  ��Ѻ��"
						+ userCh + "  ������" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		} else if (s1 + s2 + s3 > 10) {
			if (input.userChoice == 2) {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  ��" + "  ��Ѻ��"
						+ userCh + "  ��Ӯ��" + MoneyJudge.userMoney * 2);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 2;
			} else {
				System.out.println("�����֣�����" + s1 + s2 + s3 + "  ��" + "  ��Ѻ��"
						+ userCh + "  ������" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		}
		System.out.println("����ܳ���Ϊ��" + TotalMoney.totalMoney);
		if (TotalMoney.totalMoney == 0) {
			System.out.println("����������⣬��ȥϴϴ˯��");

		} else {

			a = GameEndJudge.result();

		}
		if (a.equalsIgnoreCase("y")) {
			cyclegame();
		}
	}
}
