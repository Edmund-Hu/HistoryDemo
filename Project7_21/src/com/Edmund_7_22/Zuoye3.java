package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye3 {
//��ʮ����ѭ�������û�����n���������û�����0Ϊֹ����ӡ���û������˶��ٸ����������ٸ����������ٸ����������ٸ�ż��
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		int num = 1;
		int positiveCount = 0;
		int negetiveCount = 0;
		int evenCount = 0;
		int oddCount = 0;
		while (num != 0) {
			System.out.println("��������һ������");
			num = SC.nextInt();
			if (num != 0) {
				if (num > 0) {

					positiveCount += 1;
				} else if (num < 0) {
					negetiveCount += 1;
				}
				if (num % 2 == 0) {
					evenCount += 1;
				} else {
					oddCount += 1;
				}

			}
		}
			System.out.println("�û��������������Ϊ��" + positiveCount);
			System.out.println("�û�����ĸ�������Ϊ��" + negetiveCount);
			System.out.println("�û������ż������Ϊ��" + evenCount);
			System.out.println("�û��������������Ϊ��" + oddCount);
		
	}
	
}
