package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye4 {
//��ʮ����ѭ�������û�����n���������û�����0Ϊֹ����ӡ����Щ����ƽ��ֵ
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		int num = 1;
		double sum = 0;
		int count = 0;
		double avg = 0;
	
		while (num != 0) {
			System.out.println("��������һ������");
			num = SC.nextInt();
			if(num!=0){
				sum=sum+num;
				count++;
			}

			}
		avg = sum/count;
		
		System.out.println(avg);
		}
		
		
	}
	

	


