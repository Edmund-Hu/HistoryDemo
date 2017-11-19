package com.Edmund_7_22;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Zuoye1 {
//二十、接收用户输入一个数，判断这个数是个位数，十位数，百位数，还是千位数，假设用户输入最大总是千位数，不会是万位数。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("请您输入一个小于10000的正整数");
		int num = SC.nextInt();
		//使用if语句
	/*	if(num>=10000||num<0){
			System.out.println("你输入有误！");
		}
		else if(num/1000 >0){
			System.out.println("您输入的是千位数");
		}else if(num/100 >0){
			System.out.println("您输入的百位数");
		}else if(num/10>0){
			System.out.println("您输入的是十位数");
		}else {
			System.out.println("你输入的是个位数");
		}*/
//使用循环；
		int i=0;
		do{
			num=num/10;
			i++;
		}while(num!=0);
		System.out.println("你输入的的是"+i+"位数");
	}

		
	}


