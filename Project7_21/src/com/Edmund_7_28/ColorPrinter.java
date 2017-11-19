package com.Edmund_7_28;

public class ColorPrinter implements PrintInterface {
	public String detail(){
		return "我是打印机，彩色的 ";
	}
	public void print(String content){
		System.out.println("我是彩色打印机");
		System.out.println(content);
	}
}
