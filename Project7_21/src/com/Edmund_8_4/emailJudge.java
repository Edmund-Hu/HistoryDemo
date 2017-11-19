package com.Edmund_8_4;

import java.util.Scanner;

public class emailJudge {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入一个正确的邮箱地址，如vhudp@163.com");
		String emailAdr= scanner.next();
		int index=emailAdr.indexOf("@");
		String name=emailAdr.substring(0,index);
		System.out.println("邮箱用户名为："+name);
	}
	
}
