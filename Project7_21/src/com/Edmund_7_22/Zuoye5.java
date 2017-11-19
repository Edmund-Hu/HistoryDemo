package com.Edmund_7_22;

public class Zuoye5 {
//二十四、打印出斐波拉契数列的前20项：1，1，2，3，5，8........，后一项等于前两项之和
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=1;
		int a;
		System.out.print(n2+",");
		for(int i=1;i<20;i++){
			a=n1+n2;
			System.out.print(a+",");
			n1=n2;
			n2=a;
			
		}
	}

}
