package com.Edmund_8_5;

public class TestAccount implements Runnable {

	private Account acc = new Account(500);

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			makeWithdraw(100);
			if (acc.getBalance() < 0) {
				System.out.println("�˻�͸֧��");
			}
		}
	}

	public void makeWithdraw(int amt) {
	/*	synchronized (acc) {*/
			if (acc.getBalance() >= amt) {
				System.out.println(Thread.currentThread().getName() + "��ʼȡǮ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
				acc.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ "ȡ��ɹ������Ϊ��" + acc.getBalance());
			} else {
				System.out.println("���㣡�޷�ȡ��" + "���Ϊ��" + acc.getBalance());
			}
		//}
	}

	public static void main(String[] args) {
		TestAccount ta1 = new TestAccount();
		//TestAccount ta2 = new TestAccount();
		Thread t1 = new Thread(ta1);
		t1.setName("��");
		Thread t2 = new Thread(ta1);
		t2.setName("��");
		t1.start();
		t2.start();

	}

}
