package com.Edmund_8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dome4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("������ѧʱ");
		try {
			int timetoal = sc.nextInt();
			System.out.println("�����ܿγ�");
			int courseTotal=sc.nextInt();
			System.out.println("ÿ���γ���ռ��ʱ��Ϊ��"+timetoal/courseTotal);
		} catch (InputMismatchException e) {
			System.out.println("���벻Ϊ����");
		}catch(ArithmeticException e){
			System.out.println("�ܿγ�������Ϊ��");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
