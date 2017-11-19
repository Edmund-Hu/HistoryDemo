package com.Edmund_7_26;

public class Removezero {
	public int[] remove(int arr[]){
		int count=0;
		//统计0的个数；
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}
		}
	//将arr非零的数赋值给arr2；
		int arr2[]=new int[arr.length-count];
	/*	for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]!=0&&arr2[j]==0){
					arr2[j]=arr[i];
					break;
				}
			}
		}*/
		
		int i,j=0;
		for(i=0;i<arr.length;i++){
			if(arr[i]!=0&&j<arr2.length){
				arr2[j]=arr[i];
				j++;
			}
		}
		return arr2;
		
	}
	

}
