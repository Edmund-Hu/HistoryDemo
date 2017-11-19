package com.Edmund_8_5;

public class SharedData {
	private char c;
	private boolean isProduced = false; // �ź���	
	public synchronized void putShareChar(char c) {
		// �����Ʒ��δ���ѣ��������ߵȴ�
		if (isProduced) {
			try{	System.out.println("�����߻�δ���ѣ����������ֹͣ����");
				wait(); // �����ߵȴ�
			} catch (InterruptedException e) {e.printStackTrace(); 	}
		}
		this.c = c;
		isProduced = true; // ����Ѿ�����
		notify(); // ֪ͨ�������Ѿ���������������
		System.out.println("�����˲�Ʒ" + c + "  ֪ͨ����������...");
	}	
	public synchronized char getShareChar() {
		// �����Ʒ��δ�������������ߵȴ�
		if (!isProduced){
			try{  System.out.println("�����߻�δ���������������ֹͣ����");
				wait(); // �����ߵȴ�
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		isProduced = false; // ����Ѿ�����
		notify(); // ֪ͨ��Ҫ����
		System.out.println("�����������˲�Ʒ" + c + "  ֪ͨ����������...");
		return this.c;
	}
}
