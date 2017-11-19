package com.Edmund_8_5;

public class Sleep {
	public static void bySec(long s){
		for(int i=1;i<=s;i++){
			try {
				System.out.println("³ÁË¯"+i+"´Î");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
