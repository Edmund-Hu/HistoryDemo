package com.Edmund_7_25;

public class Zuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,5,6,7,8,};
		int max=arr[0],min=arr[0],maxIndex=0,minIndex=0;
		int temp;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				maxIndex=i;
			}
			if(min>arr[i]){
				min=arr[i];
				minIndex=i;
			}
		}
		temp=arr[maxIndex];
		arr[maxIndex]=arr[minIndex];
		arr[minIndex]=temp;
		for(int x:arr){
			System.out.println(x);
		}
	}

}
