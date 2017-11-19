package com.Edmund_7_26;

public class Test_Zuoye_Sortclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,1,7,9,10};
		Zuoye_Sortclass a =new Zuoye_Sortclass();
		a.sortArray(arr);
		for(int x:a.sortArray(arr)){
			System.out.println(x);
		}
	}

}
