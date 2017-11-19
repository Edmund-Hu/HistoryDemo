package com.Edmund_8_5;

public class SetDaemon extends Thread {
	public void run(){
		while(!Thread.currentThread().isInterrupted()&&true){
			System.out.println(getName());
		}
	}
	public static void main(String[] args) {
		SetDaemon setsD= new SetDaemon();
		setsD.setDaemon(true);
		setsD.setName("后台线程");
		setsD.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
