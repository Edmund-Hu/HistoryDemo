package com.Edmund_8_5;

//�������߳�
class Consumer extends Thread {
	private SharedData s;
	Consumer(SharedData s){
		this.s = s;
	}
	public void run(){
		char ch;
		do {
			try	{
				Thread.sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ch = s.getShareChar(); // �Ӳֿ���ȡ����Ʒ
		} while (ch != 'D');
	}
}

