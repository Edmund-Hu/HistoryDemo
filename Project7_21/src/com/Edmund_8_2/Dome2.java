package com.Edmund_8_2;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Dome2 {
Scanner sc= new Scanner(System.in);
int num=0;
public boolean xxx(){
	boolean flag =false;
	System.out.println("������һ����");
	String s=sc.next();
	try {
		 num=Integer.parseInt(s);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		//System.out.println("�������");
		return false;
		
	}
}

public void Test() {
	if(this.xxx()){
		System.out.println(num);
	}else{
		System.out.print("�������,");
		this.Test();
	}
}
public static void main(String[] args) {
	Dome2 dome2=new Dome2();
	dome2.Test();
}
	



}
