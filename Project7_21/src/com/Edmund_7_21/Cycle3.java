package com.Edmund_7_21;

import java.util.Scanner;

public class Cycle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶��");
		String ClassNO = sc.next();
		System.out.println("������ð༶ѧԱ���� ");
		int TotalHC = sc.nextInt();
		int i =1;
		double sum = 0;
		while(i<=TotalHC){
			System.out.println("������ѧ��"+i+"�ĳɼ�");
			double Score = sc.nextDouble();
			sum =Score +sum;
			i++;
		}
		System.out.println(ClassNO+"C�ð༶ѧԱ��ƽ���ɼ��� "+sum/TotalHC);
	}

}
