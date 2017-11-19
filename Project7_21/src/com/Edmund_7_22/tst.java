package com.Edmund_7_22;

public class tst {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2!=0){
				continue;
			}
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
}

