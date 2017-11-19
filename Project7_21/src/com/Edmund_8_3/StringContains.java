package com.Edmund_8_3;

import java.util.ArrayList;

public class StringContains {

	public static boolean Contains(String s1, String s2) {
		char[] arrS1 = s1.toCharArray();
		char[] arrS2 = s2.toCharArray();
	
		if (s1.length() >= s2.length()) {
			for (int i = 0; i <= arrS1.length - arrS2.length; i++) {
				StringBuilder S = new StringBuilder();
				for (int j = 0; j < arrS2.length; j++) {
					S.append(arrS1[i + j]);
				}
				String SS=S.toString();
				//System.out.println(SS);
				if (s2.equals(SS)) {
					//System.out.println("zhaodao");
					return true;
				}
			}
			return false;
			
		}else{
			return false;
		}

	}

	public static void main(String[] args) {
		String s1 = "wangfeng";
		String s2 = "feng";
		System.out.println(StringContains.Contains(s1, s2));
	}

}
