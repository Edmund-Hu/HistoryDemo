package com.Edmund_8_2;

import java.util.Scanner;

public class ExceptionTest {
	public static void go(String s) throws MyException{
		//int cellphone=Integer.parseInt(s);
		if(s.length()!=11){
			throw new MyException("�ֻ�����λ������11");			
		}else if(s.matches("^\\d*\\D+\\d*$")){
			throw new MyException("���зǷ��ַ�");
		}
		else{
			System.out.println("������ȷ");
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
