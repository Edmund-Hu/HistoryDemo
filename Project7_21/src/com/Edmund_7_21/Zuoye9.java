package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye9 {
	public static void main(String[] args) {
	Scanner SC = new Scanner(System.in);
	int num = SC.nextInt();
	int i,sum=0;
	if(num>1){
		for(i=1;i<=num;i++){
		sum=sum+i;
		if(i<num){
			System.out.print(i+"+");
		}else{
			System.out.print(i);
		}
		}
		System.out.println("="+sum);
	}else {
		for(i=1;i>=num;i--){
		sum=sum+i;
		if(i>num){
			System.out.print(i+"+");
		}else{
			System.out.print(i);
		}
		}
		System.out.println("="+sum);
	}
	}
	
}
