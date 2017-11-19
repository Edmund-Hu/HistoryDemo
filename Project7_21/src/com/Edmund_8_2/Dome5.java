package com.Edmund_8_2;

import java.util.Scanner;

public class Dome5 {
	String id;
	public void setId(String pld){
		if(pld.length()==7){
			id=pld;
		}else{
			throw new IllegalArgumentException("参数长度应为7！");
		}
	} 
	public static void main(String[] args) {
		Dome5 dome5=new Dome5();
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入教员编号");
		String pld=scanner.next();
		
		try {
			dome5.setId(pld);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
