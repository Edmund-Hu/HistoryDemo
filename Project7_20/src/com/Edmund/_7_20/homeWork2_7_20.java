package com.Edmund._7_20;

import java.util.Scanner;

public class homeWork2_7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入y或者n");
		String n = input.next();
		System.out.println(n);
		System.out.println(n.equals("y"));
		System.out.println(n.equals("y")?"听到指令，打开电灯":"指令不对，点灯打不开");
		
		
		
	}

}

