package com.Edmund_7_25;

public class Zuoye4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,5,6,7,8,};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
					
		}
		System.out.println("������鹲��ż����"+evenCount+"��");
		System.out.println("������鹲��������"+oddCount+"��");
	}

}
