package com.Edmund_8_5;

class CommunicationDemo{
	public static void main(String[] args){
		//共享同一个共享资源
		SharedData s = new SharedData();
		//消费者线程
		new Consumer(s).start();
		//生产者线程
		new Producer(s).start();
	}
}
