package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye7 {
//二十六、接收用户输入两个数，打印出这两个的最大公约数和最小公倍数
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入两个自然数");
		int x =SC.nextInt();
		int y = SC.nextInt();
		int max,min;
		//比较他们的大小
		if(x>=y){
			max=x;
			min=y;
		}else{
			max=y;
			min=x;
		}
		//求最大公约数
		for(int i=min;i>=1;i--){
			if(x%i==0 && y%i==0){
				System.out.println(x+"和"+y+"的最大公约数为："+i);
				break;
			}
		}
		//求最小公因数
		for(int i=max;i>=max;i++){
			if(i%x==0 && i%y==0){
				System.out.println(x+"和"+y+"的最小公倍数为："+i);
				break;
			}
		}
	}

}
