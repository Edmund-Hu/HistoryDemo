package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye6 {
	//��ʮ�塢�����û���������������Ϊx�к�y�У���ӡһ��x��y�е�#�ž���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("����������x������y(����1)");
		int x =SC.nextInt();
		int y = SC.nextInt();
		for(int i=1;i<=x;i++){
			for(int j =1;j<=y;j++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
