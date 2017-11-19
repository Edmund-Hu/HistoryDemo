package com.Edmund_7_21;

import java.util.Scanner;

public class Zuoye7 {

	public static void main(String[] args) {
	Scanner SC = new Scanner(System.in);
	int num = SC.nextInt();
	int i;
	if(num>1){
		for(i=1;i<=num;i++){
			if(!((i%2)==0)){
				System.out.println(i);
			}
		}
	}else {
		for(i=1;i>=num;i--){
			if(!((i%2)==0)){
				System.out.println(i);
			}
		}
	}

	}

}
