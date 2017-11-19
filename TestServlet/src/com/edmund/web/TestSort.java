package com.edmund.web;

public class TestSort {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,10,9};
		//冒泡排序：
	    	//第一重循环表示要冒泡的次数，注意数组越界问题...
		long start = System.nanoTime();
		boolean flag;
		for(int i=0; i<a.length-1; i++){
			flag=true;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j] > a[j+1]){  //将每相邻的两个数相比
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
		long end = System.nanoTime();
		for (int i : a) {
			System.out.print(i+",");
		}
		System.out.println(end-start);
	}

}
