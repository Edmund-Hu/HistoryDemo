package com.Edmund_8_5;

public class TestAccount implements Runnable {

	private Account acc = new Account(500);

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			makeWithdraw(100);
			if (acc.getBalance() < 0) {
				System.out.println("账户透支了");
			}
		}
	}

	public void makeWithdraw(int amt) {
	/*	synchronized (acc) {*/
			if (acc.getBalance() >= amt) {
				System.out.println(Thread.currentThread().getName() + "开始取钱");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
				acc.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ "取款成功，余额为：" + acc.getBalance());
			} else {
				System.out.println("余额不足！无法取款" + "余额为：" + acc.getBalance());
			}
		//}
	}

	public static void main(String[] args) {
		TestAccount ta1 = new TestAccount();
		//TestAccount ta2 = new TestAccount();
		Thread t1 = new Thread(ta1);
		t1.setName("我");
		Thread t2 = new Thread(ta1);
		t2.setName("你");
		t1.start();
		t2.start();

	}

}
