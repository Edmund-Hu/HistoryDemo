package com.Edmund_8_5;

class CommunicationDemo{
	public static void main(String[] args){
		//����ͬһ��������Դ
		SharedData s = new SharedData();
		//�������߳�
		new Consumer(s).start();
		//�������߳�
		new Producer(s).start();
	}
}
