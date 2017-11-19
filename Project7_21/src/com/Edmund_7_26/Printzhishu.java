package com.Edmund_7_26;

public class Printzhishu {
	public void printzs(int x){
		boolean flag = true;
		if (x == 2) {
			System.out.println("2");;
		} else if (x > 2) {

			for (int i = x; i >1; i--) {
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag = false;
						break;
					}else{
						flag=true;
					}
				}
				if(flag){
					System.out.println(i);
				}
			}
			
		}
	
	}
	
}
