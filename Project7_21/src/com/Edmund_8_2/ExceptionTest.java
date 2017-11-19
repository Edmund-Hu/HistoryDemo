package com.Edmund_8_2;

import java.util.Scanner;

public class ExceptionTest {
	public static void go(String s) throws MyException{
		//int cellphone=Integer.parseInt(s);
		if(s.length()!=11){
			throw new MyException("手机号码位数不是11");			
		}else if(s.matches("^\\d*\\D+\\d*$")){
			throw new MyException("含有非法字符");
		}
		else{
			System.out.println("输入正确");
		}
	}
public static void main(String[] args) {
	
	String s="12297938111";
	//System.out.println(s.matches("^\\d*\\D{1,}\\d*$"));
	try {
		go(s);
	} catch (MyException e) {
		System.out.println(e.getmessage());
	}
		

	}
		
}
