package com.Edmund._7_20;

public class homeWork_test5_7_20 {
	public static void main(String[] args) {
		int i = 2, j = 10;
	/*	
		 * System.out.println( i>5 && (j--)<10);//false;i>5Ϊ�٣�&&�������䲻ִ��
		 * System.out.println("i="+ i + ", j=" + j);//i=2;j=10
		 * System.out.println( i<5 && (j--)<10);//false j��ɼ�����һ
		 * System.out.println("i="+ i + ", j=" + j);//i=2,j=9;
		 * 
		 * System.out.println(i<5 || (j--)<10);//true i<5Ϊ�棬������䲻ִ�У�
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
