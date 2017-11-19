package com.Edmund_8_5;

public class JoinTest extends Thread {
	public JoinTest(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName()+""+i);
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==5){
				
			JoinTest Jt= new JoinTest("这是半路加入的线程");
			//Jt.start();
			try {
				Jt.start();
				Jt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			System.out.println(Thread.currentThread().getName()+""+i);
		}
		
	}
}
