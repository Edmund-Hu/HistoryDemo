package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a , b ,c ,max,min,temp;
		System.out.println("输入3个整数：");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
	if(a>b){
		max=a;
		min=b;
	}else{
		max=b;
		min=a;
	}
	if(max>c&&min<c){	//	中间数C
		temp=c;
		if(max-min>temp){
			System.out.println("最大值和最小值差值大于中间数");
		}else if(max-min<temp){
			System.out.println("最大值和最小值差值小于中间数");
		}else{
			System.out.println("最大值和最小值差值等于中间数");
		}
		}else if(max<=c){ //中间数 max
			temp=max;
			max=c;
			if(max-min>temp){
				System.out.println("最大值和最小值差值大于中间数");
			}else if(max-min<temp){
				System.out.println("最大值和最小值差值小于中间数");
			}else{
				System.out.println("最大值和最小值差值等于中间数");
			}	
			
		}else if(min>=c){// 中间数min
			temp=min;
			min=c;
		
			if(max-min>temp){
				System.out.println("最大值和最小值差值大于中间数");
			}else if(max-min<temp){
				System.out.println("最大值和最小值差值小于中间数");
			}else{
				System.out.println("最大值和最小值差值等于中间数");
			}
		}

	}

}
