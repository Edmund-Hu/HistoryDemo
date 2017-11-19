package com.Edmund_7_28;

public class BlackPrinter implements PrintInterface {
	public String detail(){
		return "我是打印机，黑白的 ";
	}
	@Override
	public void print(String content) {
		System.out.println("我是黑白打印机");
		System.out.println(content);
		
	}

}
