package com.Edmund._7_20;

import java.util.Scanner;
//接收用户输入三个整数分别代表三角形的三边长度，显示出该三边长度是否可以组成三角形，可以组成就在控制台打印“能够组成三角形”不可以组成就在控制台打印“不能够组成三角形”
public class Zuoye4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a , b ,c;
		System.out.println("输入3个整数：");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
	
 if(a+b>c&& a+c>b&&b+c>a){
	 System.out.println("可以组成三角形");
 }else{
	 System.out.println("不能组成三角形");
 }
}
}
