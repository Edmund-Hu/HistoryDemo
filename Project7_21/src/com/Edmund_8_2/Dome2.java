package com.Edmund_8_2;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Dome2 {
Scanner sc= new Scanner(System.in);
int num=0;
public boolean xxx(){
	boolean flag =false;
	System.out.println("请输入一个数");
	String s=sc.next();
	try {
		 num=Integer.parseInt(s);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		//System.out.println("输入错误");
		return false;
		
	}
}

public void Test() {
	if(this.xxx()){
		System.out.println(num);
	}else{
		System.out.print("输入错误,");
		this.Test();
	}
}
public static void main(String[] args) {
	Dome2 dome2=new Dome2();
	dome2.Test();
}
	



}
