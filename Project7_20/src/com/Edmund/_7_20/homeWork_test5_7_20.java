package com.Edmund._7_20;

public class homeWork_test5_7_20 {
	public static void main(String[] args) {
		int i = 2, j = 10;
	/*	
		 * System.out.println( i>5 && (j--)<10);//false;i>5为假，&&后面的语句不执行
		 * System.out.println("i="+ i + ", j=" + j);//i=2;j=10
		 * System.out.println( i<5 && (j--)<10);//false j完成计算后减一
		 * System.out.println("i="+ i + ", j=" + j);//i=2,j=9;
		 * 
		 * System.out.println(i<5 || (j--)<10);//true i<5为真，后面语句不执行，
		 * System.out.println("i="+ i + ", j=" + j);//i=2,j=9;
		 * System.out.println(i>5 || (j--)<10);//true System.out.println("i="+ i
		 * + ", j=" + j);//i=2,j=8;*/		 
		System.out.println(i > 5 & (j--) < 10);// false;
		System.out.println("i=" + i + ", j=" + j);// i=2;j=9
		System.out.println(i < 5 & (j--) < 10);// true
		System.out.println("i=" + i + ", j=" + j);// i=2,j=8;

		System.out.println(i < 5 | (j--) < 10);// true
		System.out.println("i=" + i + ", j=" + j);// i=2,j=7;
		System.out.println(i > 5 | (j--) < 10);// true
		System.out.println("i=" + i + ", j=" + j);// i=2,j=6;//

	}

}
