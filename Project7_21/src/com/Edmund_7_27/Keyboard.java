package com.Edmund_7_27;

public class Keyboard{
	int price;		//键盘价格
	int keyCount;	//按键数量
	int weight;		//键盘重量
	void make(int n, int w){
		keyCount = n;
		weight = w;
	}
	//显示键盘信息
	void displayInfo(){
		System.out.println("这个键盘对象的信息如下");
		System.out.println("键盘价格：" + price);
		System.out.println("键盘重量：" + weight);
		System.out.println("按键数量：" + keyCount);
	}
	//用户按键
	void click(){
		System.out.println("用户按下一个键");
	}
	//模拟连接
	void connect(){
		System.out.println("键盘已与电脑连接");
	}
	//模拟断开
	void disconnect(){
		System.out.println("键盘已与电脑断开");
	}
	
	public static void main(String[] args){
		Keyboard k1 = new Keyboard();
		k1.make(101, 300);
		//k1.weight=320;
		//k1.price = 78;
		k1.displayInfo();
		k1.connect();
		k1.click();
		k1.disconnect();
	}
}

