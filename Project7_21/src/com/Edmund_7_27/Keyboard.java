package com.Edmund_7_27;

public class Keyboard{
	int price;		//���̼۸�
	int keyCount;	//��������
	int weight;		//��������
	void make(int n, int w){
		keyCount = n;
		weight = w;
	}
	//��ʾ������Ϣ
	void displayInfo(){
		System.out.println("������̶������Ϣ����");
		System.out.println("���̼۸�" + price);
		System.out.println("����������" + weight);
		System.out.println("����������" + keyCount);
	}
	//�û�����
	void click(){
		System.out.println("�û�����һ����");
	}
	//ģ������
	void connect(){
		System.out.println("���������������");
	}
	//ģ��Ͽ�
	void disconnect(){
		System.out.println("����������ԶϿ�");
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

