package com.Edmund_8_4;

import java.util.Scanner;

public class emailJudge {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("������һ����ȷ�������ַ����vhudp@163.com");
		String emailAdr= scanner.next();
		int index=emailAdr.indexOf("@");
		String name=emailAdr.substring(0,index);
		System.out.println("�����û���Ϊ��"+name);
	}
	
}
