package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye8 {
//��ʮ�ߡ������û�����һ��������ӡ����������ڵ���������
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("������һ������");
		int x = SC.nextInt();
		boolean flag = true;
		if (x == 2) {
			System.out.println("2���ڵ�������2");
		} else if (x > 2) {

			for (int i = x; i >1; i--) {
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag = false;
						break;
					}else{
						flag=true;
					}
				}
				if(flag){
					System.out.println(i);
				}
			}
			
		}
	}
}
