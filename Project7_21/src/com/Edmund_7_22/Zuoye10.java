package com.Edmund_7_22;

public class Zuoye10 {

	public static void main(String[] args) {
		// 兔子问题为斐波拉契数列
		int n1=0;
		int n2=1;
		int a = 1;
		//System.out.print(n2+",");
		for(int i=1;i<20;i++){
			a=n1+n2;
			n1=n2;
			n2=a;	
		}
		System.out.println("20个月后兔子总数为："+a);

	}

}
