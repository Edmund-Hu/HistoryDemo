package com.Edmund_7_22;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Zuoye1 {
//��ʮ�������û�����һ�������ж�������Ǹ�λ����ʮλ������λ��������ǧλ���������û������������ǧλ������������λ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("��������һ��С��10000��������");
		int num = SC.nextInt();
		//ʹ��if���
	/*	if(num>=10000||num<0){
			System.out.println("����������");
		}
		else if(num/1000 >0){
			System.out.println("���������ǧλ��");
		}else if(num/100 >0){
			System.out.println("������İ�λ��");
		}else if(num/10>0){
			System.out.println("���������ʮλ��");
		}else {
			System.out.println("��������Ǹ�λ��");
		}*/
//ʹ��ѭ����
		int i=0;
		do{
			num=num/10;
			i++;
		}while(num!=0);
		System.out.println("������ĵ���"+i+"λ��");
	}

		
	}


