package com.Edmund_7_22;

public class Monkeyproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peachCount=1;
		int i;
		for(i=9;i>=1;i--){
			peachCount=(peachCount+1)*2;
			}
		System.out.println("第"+(i+1)+"天桃子总数为"+peachCount);
	}

}

