package com.Edmund_7_25;



public class Zuoye5_Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,6,2,1,7,9,4,3,2,8};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]>arr[j-1]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}	
	for(int x:arr){
		System.out.print(x+"  ");
	}
	}

}
