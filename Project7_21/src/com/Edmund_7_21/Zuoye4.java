package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a , b ,c ,max,min,temp;
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
	if(max>c&&min<c){	//	�м���C
		temp=c;
		if(max-min>temp){
			System.out.println("���ֵ����Сֵ��ֵ�����м���");
		}else if(max-min<temp){
			System.out.println("���ֵ����Сֵ��ֵС���м���");
		}else{
			System.out.println("���ֵ����Сֵ��ֵ�����м���");
		}
		}else if(max<=c){ //�м��� max
			temp=max;
			max=c;
			if(max-min>temp){
				System.out.println("���ֵ����Сֵ��ֵ�����м���");
			}else if(max-min<temp){
				System.out.println("���ֵ����Сֵ��ֵС���м���");
			}else{
				System.out.println("���ֵ����Сֵ��ֵ�����м���");
			}	
			
		}else if(min>=c){// �м���min
			temp=min;
			min=c;
		
			if(max-min>temp){
				System.out.println("���ֵ����Сֵ��ֵ�����м���");
			}else if(max-min<temp){
				System.out.println("���ֵ����Сֵ��ֵС���м���");
			}else{
				System.out.println("���ֵ����Сֵ��ֵ�����м���");
			}
		}

	}

}
