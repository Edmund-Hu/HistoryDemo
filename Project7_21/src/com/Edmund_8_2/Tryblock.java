package com.Edmund_8_2;

import java.util.Scanner;

import com.Edmund_7_27.Xiushifu_TEST;

public class Tryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入a的值");
		int a= sc.nextInt();
		String  s=sc.next();
		try {
			int b=8/a;
			int c=Integer.parseInt(s);
			System.out.println(b);
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("异常信息");
			e.printStackTrace();
			//.getMessage();
			
		}finally{
			System.out.println("程序继续");
		}
		
	}

}
