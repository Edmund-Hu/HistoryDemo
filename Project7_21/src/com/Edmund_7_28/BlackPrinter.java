package com.Edmund_7_28;

public class BlackPrinter implements PrintInterface {
	public String detail(){
		return "���Ǵ�ӡ�����ڰ׵� ";
	}
	@Override
	public void print(String content) {
		System.out.println("���Ǻڰ״�ӡ��");
		System.out.println(content);
		
	}

}
