package com.Edmund_Homework;

import java.util.*;

public class EnglishWordCalculate {

	public static void main(String[] args) {
		String paragraph = "good good study ,day day up";
		String par[] = paragraph.split(", |\\.|\\?|!| ,| ");
		String str;
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < par.length; i++) {
			sbf.append(par[i]);
		}
		str = sbf.toString();
		char arr[] = str.toCharArray();
		// System.out.println(str);
		HashMap<Character, Integer> arrmap = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			arrmap.put(arr[i], 1);
		}
		// System.out.println(arrmap.keySet());
		//统计每个字符出现的个数
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++){
				
				if (arr[j]==arr[i]) {
					count++;	
				}		
		}
			arrmap.put(arr[i], count);
		}
		System.out.println(arrmap);

	}

}
