package com.Edmund_7_21;

import java.util.Scanner;
//�����û���������������ӡ���������͵ڶ������֮��Ĳ�ֵ
public class Zuoye3 {

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
		min=c;
		System.out.println(max-min);
		}else if(max<=c){
			min=max;
			max=c;
			System.out.println(max-min);
		}else if(min>=c){

			System.out.println(max-min);
		}
	}

}
