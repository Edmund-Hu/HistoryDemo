package com.Edmund_7_25;


import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,4,2,1,23,344,12};
		int y,max=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ����");
		y=sc.nextInt();
/*		for(int x:arr){
			sum=sum+x;	
			if(y==x){
				System.out.println("��ϲ���н���");
			}
		}*/
		
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			
			if(y==arr[i]){
				System.out.println("��ϲ���н���");
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("����ĺ�Ϊ��"+sum);
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(max);
	}

}
