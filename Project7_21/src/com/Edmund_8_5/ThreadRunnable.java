package com.Edmund_8_5;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		//while(true){
		//	System.out.println("ºÃÀÛ°¡£¬ºÃÀÛ°¡___________------");
		//	Thread.currentThread().setPriority(1);
			String t2=Thread.currentThread().toString();
	/*	for(int i=1;i>0;i++){
			System.out.println(t2);
			System.out.println(Thread.currentThread());
			System.out.println(i);*/
		//}
	/*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			while(!Thread.currentThread().isInterrupted() && true){
			   System.out.println("hahaha");
			}
			
			
			
		}
		
	}


