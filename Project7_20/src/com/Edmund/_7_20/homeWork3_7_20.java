package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork3_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int a = input.nextInt();
		System.out.println(a%2==0?"�������ż��":"����������� ");
		System.out.println(a<0?"������Ǹ���":"������ǷǸ��� ");
		System.out.println(a<0?"������Ǹ���":a==0?"���������":"�����������");
	}

}
