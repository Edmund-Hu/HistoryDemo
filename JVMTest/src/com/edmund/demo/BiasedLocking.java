package com.edmund.demo;

import java.util.List;
import java.util.Vector;

public class BiasedLocking {
	 public static List<Integer> numberList = new Vector<Integer>();
	 public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int count = 0;
		int startnum = 0;
		while(count<20000000){
			numberList.add(startnum);
			startnum+=2;
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
