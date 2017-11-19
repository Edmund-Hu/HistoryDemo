package com.Edmund_7_26;

public class Zuoye_Sortclass {
	public int[] sortArray(int arr[]){
		int temp;
		boolean flag;
		for(int i=1;i<arr.length;i++){
			flag=true;
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
		
		return arr;
	}
}
