package com.Edmund._7_20;

import java.util.Scanner;


public class Zuoye6 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int a , b ,c,d, max,min;
		System.out.println("����4��������");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		if(a>b){
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		if(min>=c){
			//System.out.println("�ڶ���ֵ"+min);
		}else if(min < c){
			if (max>c){
				min = c;//System.out.println("�ڶ���ֵ"+c);	
			}else{
				min=max;
				max= c;
				//System.out.println("�ڶ���ֵ"+min);	
			}
		}
		if(min>d){
			System.out.println("�ڶ���ֵ"+min);
		}else if(min < d){
			if (max>d){
				min=d;
				System.out.println("�ڶ���ֵ"+min);	
			}else{
				min=max;
				max= d;
				System.out.println("�ڶ���ֵ"+min);	
				
			}
		}
	
		
		

		
		}
}
