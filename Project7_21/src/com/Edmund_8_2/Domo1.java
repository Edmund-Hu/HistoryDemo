package com.Edmund_8_2;

import java.util.Scanner;

public class Domo1 {
	static Scanner sc= new Scanner(System.in);//��̬����ֻ�ܵ��þ�̬��Ա�ͷ�����
	public static void Inputxx(){
		System.out.println("������γ̺�1-3");
		int course=0;
	try{
		course=sc.nextInt();
	
	}catch(Exception ex){
		System.out.println("���벻Ϊ����");
		//ex.printStackTrace();
		sc.next();
		Inputxx();
	}
		
/*		switch (course) {
		
		case 1:
			System.out.println("JAVA�γ�");
			break;
		case 2:
			System.out.println("UI�γ�");
			break;
		case 3:
			System.out.println("PhP�γ�");
			break;
		default:
			System.out.println("��������");
			Inputxx();
			break;
		}*/
	finally{
		System.out.println("��ӭ�������");
	}
	System.out.println("������һ����");
	
}
	
public static void main(String[] args) {
	//Domo1 domo1=new Domo1();
	Inputxx();
	
}
}
