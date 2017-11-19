package com.Edmund._7_20;

import java.util.Scanner;

public class Shangji2 {

	public static void main(String[] args) {
		//  Auto-generated method stub

			String s;
			char c;
			Scanner input = new Scanner(System.in);
			s = input.next();
			c = s.charAt(0);
			if(c<32){
				System.out.println("这是一个控制字符 ");
			}else if(c >= '0' && c <= '9'){
				System.out.println("这是一个数字");
			}else if(c >= 'A' && c<= 'Z' ){
				System.out.println("这是大写字母");
			}else if(c >= 'a' && c<= 'z' ){
				System.out.println("这是小写字母");
			}
	}

}
