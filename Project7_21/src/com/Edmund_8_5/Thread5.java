package com.Edmund_8_5;

public class Thread5 extends Thread {
	public Thread5(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(this.getName()+"��"+(i+1)+"������");
			
		}
	}
}
