package com.Edmund_8_5;

import com.Edmund_7_22.test2;

public class Thread1Test {
	public static void main(String[] args) {
		//ʵ�����̳��߳�
		Thread1 thread1= new Thread1();
		//thread1.start();
		String t1=Thread.currentThread().getName();
		//ʵ��������߳�
		ThreadRunnable tR= new ThreadRunnable();
		Thread thread=new Thread(tR);
	
		thread.start();
		thread.interrupt();
		
	/*	
		while(true){
			System.out.println("���������ˣ��ڹ���ͣ�");
			System.out.println(t1);
		}*/
		
		//System.out.println(t2);
	}
	
}
