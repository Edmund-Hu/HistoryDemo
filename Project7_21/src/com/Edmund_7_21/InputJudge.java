package com.Edmund_7_21;

import java.util.Scanner;

public class InputJudge {
	public static int userChoice;

	public void choiceInput() {
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
			System.out.println("输入有误请重新输入");
			choiceInput();
		} else {

		}
	}
}
