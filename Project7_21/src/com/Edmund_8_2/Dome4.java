package com.Edmund_8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dome4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("输入总学时");
		try {
			int timetoal = sc.nextInt();
			System.out.println("输入总课程");
			int courseTotal=sc.nextInt();
			System.out.println("每个课程所占的时间为："+timetoal/courseTotal);
		} catch (InputMismatchException e) {
			System.out.println("输入不为数字");
		}catch(ArithmeticException e){
			System.out.println("总课程数不能为零");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
