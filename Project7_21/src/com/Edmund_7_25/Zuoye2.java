package com.Edmund_7_25;

public class Zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,5,6,7,8,};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}	
		}
		System.out.println(max);
	}

}
