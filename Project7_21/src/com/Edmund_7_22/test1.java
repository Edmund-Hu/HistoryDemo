package com.Edmund_7_22;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 12345;
		int r_right=0;
		int a;
		System.out.println("翻转后的整数是：");
		int i=100000;
		while(val!=0){
			a=val%10;
			val=val/10;
			i=i/10;
			r_right=a*i+r_right;
			System.out.print(a);
		}
		System.out.print("    "+r_right);
	}

}
