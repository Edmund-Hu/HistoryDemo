package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye7 {
//��ʮ���������û���������������ӡ�������������Լ������С������
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("������������Ȼ��");
		int x =SC.nextInt();
		int y = SC.nextInt();
		int max,min;
		//�Ƚ����ǵĴ�С
		if(x>=y){
			max=x;
			min=y;
		}else{
			max=y;
			min=x;
		}
		//�����Լ��
		for(int i=min;i>=1;i--){
			if(x%i==0 && y%i==0){
				System.out.println(x+"��"+y+"�����Լ��Ϊ��"+i);
				break;
			}
		}
		//����С������
		for(int i=max;i>=max;i++){
			if(i%x==0 && i%y==0){
				System.out.println(x+"��"+y+"����С������Ϊ��"+i);
				break;
			}
		}
	}

}
