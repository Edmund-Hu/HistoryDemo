package com.Edmund_7_21;

import java.util.Scanner;

public class Cycle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级号");
		String ClassNO = sc.next();
		System.out.println("请输入该班级学员总数 ");
		int TotalHC = sc.nextInt();
		int i =1;
		double sum = 0;
		while(i<=TotalHC){
			System.out.println("请输入学号"+i+"的成绩");
			double Score = sc.nextDouble();
			sum =Score +sum;
			i++;
		}
		System.out.println(ClassNO+"C该班级学员的平均成绩是 "+sum/TotalHC);
	}

}
