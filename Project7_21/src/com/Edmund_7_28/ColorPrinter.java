package com.Edmund_7_28;

public class ColorPrinter implements PrintInterface {
	public String detail(){
		return "���Ǵ�ӡ������ɫ�� ";
	}
	public void print(String content){
		System.out.println("���ǲ�ɫ��ӡ��");
		System.out.println(content);
	}
}
