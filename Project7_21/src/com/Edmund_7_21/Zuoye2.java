package com.Edmund_7_21;

import java.util.Scanner;
//�����û���������������ӡ������������С�����Ĳ�ֵ
public class Zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a , b ,c ,max,min;
		System.out.println("����3��������");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
	if(a>b){
		max=a;
		min=b;
	}else{
		max=b;
		min=a;
	}
	if(max>c&&min<c){
		System.out.println(max-min);
		}else if(max<=c){
			max=c;
			System.out.println(max-min);
		}else if(min>=c){
			min=c;
			System.out.println(max-min);
		}
	}
}
