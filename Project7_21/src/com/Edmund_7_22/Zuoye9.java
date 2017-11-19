package com.Edmund_7_22;

public class Zuoye9 {
//二十八、打印出所有的“水仙花数”
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
		int a=i%10;
		int b=i/10%10;
		int c=i/100;
		if(a*a*a+b*b*b+c*c*c==i){
			System.out.println(i);
		}
		}

	}

}
