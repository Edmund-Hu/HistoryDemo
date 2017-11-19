package com.Edmund_7_21;

import java.util.Scanner;

public class GameEndJudge {

	public static String result() {
		System.out.println("您还要继续玩吗？（y/n）");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if (!a.equals("y") && !a.equals("n")) {
			System.out.println("输入有误，请重新选择");
			result();
		}
		return a;
	}
}
