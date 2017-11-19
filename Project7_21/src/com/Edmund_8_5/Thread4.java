package com.Edmund_8_5;

public class Thread4 extends Thread {
	public Thread4(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(this.getName()+"第"+(i+1)+"次运行");

		}
	}
}
