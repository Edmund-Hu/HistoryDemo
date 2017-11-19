package com.Edmund_7_21;
public class Game1 {

	public static void main(String[] args) {
		System.out.println("欢迎进入摇色子游戏，精彩即将开始……");
		TotalMoney.totalMoneyInput();
		Gamebody.cyclegame();
		System.out.println("游戏结束，谢谢！");
		System.exit(0);
	}
}
