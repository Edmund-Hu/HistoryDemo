package com.Edmund._7_20;

import java.util.Scanner;

public class Zuoye7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.println("����1��������");
		a = input.nextInt();
		if(a % 2 == 0){
			System.out.println(" ż��");
		}else{
			System.out.println("����");
		}
		if(a>0){
			System.out.println(" ����");
		}else if(a<0)	{
			System.out.println(" ����");
			}else{
				System.out.println(" ��");
			}
		}

}
