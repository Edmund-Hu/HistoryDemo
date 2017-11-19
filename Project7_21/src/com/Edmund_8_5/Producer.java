package com.Edmund_8_5;

class Producer extends Thread {
	private SharedData s;
	Producer(SharedData s){
		this.s = s;
	}
	public void run(){
		for (char ch = 'A'; ch <= 'D'; ch++){
			try{
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			s.putShareChar(ch); // 将产品放入仓库
		}
	}
}

