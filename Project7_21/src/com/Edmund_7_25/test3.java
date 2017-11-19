package com.Edmund_7_25;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] num={{2,3,4},{12,34,5},{23,45,7}};
		int[][] nm =new int[2][];
		nm[0]=new int[2];
		nm[1]=new int[3];
		
		for(int a[]:num){
			for(int x:a){
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j){
					sum=sum+num[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
