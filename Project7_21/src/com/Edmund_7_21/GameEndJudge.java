package com.Edmund_7_21;

import java.util.Scanner;

public class GameEndJudge {

	public static String result() {
		System.out.println("����Ҫ�������𣿣�y/n��");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if (!a.equals("y") && !a.equals("n")) {
			System.out.println("��������������ѡ��");
			result();
		}
		return a;
	}
}
