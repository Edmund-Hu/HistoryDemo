package com.Edmund_8_5;

public class SharedData {
	private char c;
	private boolean isProduced = false; // 信号量	
	public synchronized void putShareChar(char c) {
		// 如果产品还未消费，则生产者等待
		if (isProduced) {
			try{	System.out.println("消费者还未消费，因此生产者停止生产");
				wait(); // 生产者等待
			} catch (InterruptedException e) {e.printStackTrace(); 	}
		}
		this.c = c;
		isProduced = true; // 标记已经生产
		notify(); // 通知消费者已经生产，可以消费
		System.out.println("生产了产品" + c + "  通知消费者消费...");
	}	
	public synchronized char getShareChar() {
		// 如果产品还未生产，则消费者等待
		if (!isProduced){
			try{  System.out.println("生产者还未生产，因此消费者停止消费");
				wait(); // 消费者等待
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		isProduced = false; // 标记已经消费
		notify(); // 通知需要生产
		System.out.println("消费者消费了产品" + c + "  通知生产者生产...");
		return this.c;
	}
}
