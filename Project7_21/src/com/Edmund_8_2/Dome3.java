package com.Edmund_8_2;

import java.util.Scanner;

public class Dome3 {
	static Scanner sc= new Scanner(System.in);
	static int num=0;
	public static int xx(){
		try {
			System.out.println("������һ����");
			num = sc.nextInt();
			System.out.println("�ܴ�"+num);
			return 1;
		} catch (Exception e) {
			System.out.println("�ܶ�"+num);
			return 2;
		}
		finally{
			System.out.println("��С"+num);
			//return 3;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(Dome3.xx());
	}
}
