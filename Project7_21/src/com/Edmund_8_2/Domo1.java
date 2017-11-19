package com.Edmund_8_2;

import java.util.Scanner;

public class Domo1 {
	static Scanner sc= new Scanner(System.in);//静态方法只能调用静态成员和方法；
	public static void Inputxx(){
		System.out.println("请输入课程号1-3");
		int course=0;
	try{
		course=sc.nextInt();
	
	}catch(Exception ex){
		System.out.println("输入不为数字");
		//ex.printStackTrace();
		sc.next();
		Inputxx();
	}
		
/*		switch (course) {
		
		case 1:
			System.out.println("JAVA课程");
			break;
		case 2:
			System.out.println("UI课程");
			break;
		case 3:
			System.out.println("PhP课程");
			break;
		default:
			System.out.println("输入有误");
			Inputxx();
			break;
		}*/
	finally{
		System.out.println("欢迎提出建议");
	}
	System.out.println("进入下一环节");
	
}
	
public static void main(String[] args) {
	//Domo1 domo1=new Domo1();
	Inputxx();
	
}
}
