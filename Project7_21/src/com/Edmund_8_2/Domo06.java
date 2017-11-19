package com.Edmund_8_2;

import java.util.Scanner;

public class Domo06 {
	public void xxx(int m,int n) throws MyException{
		int num=0;
		if(n!=0){
			num=m/n;
			System.out.println(num);
		}else{
			throw new MyException("³ýÊý²»ÎªÁã");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			Domo06 domo06=new Domo06();
			domo06.xxx(8, 0);
		} catch (MyException e) {
			System.out.println(e.getmessage());;
			//System.out.println("jaksj");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}


