package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye2 {
//��ʮһ�������û�����һ�������жϸ����Ƿ�Ϊ����
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("��������һ������");
		int num = SC.nextInt();
		int i;
		boolean flag = false;		
		if (num == 2) {
			System.out.println("�����������");
		} else if (num == 0 || num == 1) {
			System.out.println("���������������Ҳ���Ǻ���");
		} else {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					flag=true;	
				} 

			}
			if(flag){
				System.out.println("�������������");	
			}else{
				System.out.println("�����������");
			}
		}

	}

}
