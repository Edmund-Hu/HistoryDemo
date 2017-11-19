package com.Edmund_7_21;

import java.util.Random;

public class Gamebody {
	static String a = "n";

	public static void cyclegame() {
		System.out.println("请下注：(1 押小；2 押大；3押豹子)");
		InputJudge input = new InputJudge();
		input.choiceInput();

		String userCh = "";

		switch (input.userChoice) {
		case 1:
			userCh = "小";
			break;
		case 2:
			userCh = "大";
			break;
		case 3:
			userCh = "豹子";
			break;
		}
		MoneyJudge moneyJudge = new MoneyJudge();
		moneyJudge.moneyInput();

		// 产生随机数；
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
		// 判断摇色子的结果并输出
		if (s1 == s2 && s2 == s3) {
			if (input.userChoice == 3) {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  豹子" + "  您押了"
						+ userCh + "  您赢了" + MoneyJudge.userMoney * 36);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 36;
			} else {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  豹子" + "  您押了"
						+ userCh + "  您输了" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		} else if (s1 + s2 + s3 <= 10) {
			if (input.userChoice == 1) {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  小" + "  您押了"
						+ userCh + "  您赢了" + MoneyJudge.userMoney * 2);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 2;
			} else {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  小" + "  您押了"
						+ userCh + "  您输了" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		} else if (s1 + s2 + s3 > 10) {
			if (input.userChoice == 2) {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  大" + "  您押了"
						+ userCh + "  您赢了" + MoneyJudge.userMoney * 2);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						+ MoneyJudge.userMoney * 2;
			} else {
				System.out.println("买定离手，开，" + s1 + s2 + s3 + "  大" + "  您押了"
						+ userCh + "  您输了" + MoneyJudge.userMoney);
				TotalMoney.totalMoney = TotalMoney.totalMoney
						- MoneyJudge.userMoney;
			}

		}
		System.out.println("你的总筹码为：" + TotalMoney.totalMoney);
		if (TotalMoney.totalMoney == 0) {
			System.out.println("您已输个精光，回去洗洗睡吧");

		} else {

			a = GameEndJudge.result();

		}
		if (a.equalsIgnoreCase("y")) {
			cyclegame();
		}
	}
}
