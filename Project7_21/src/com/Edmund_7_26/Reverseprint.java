package com.Edmund_7_26;

public class Reverseprint {
	public int[] reverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return arr;
	}
}
