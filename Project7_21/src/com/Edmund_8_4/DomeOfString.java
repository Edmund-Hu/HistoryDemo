package com.Edmund_8_4;

public class DomeOfString {
	public static void main(String[] args) {
		String str= "printing backwords";
		for (int i = 0; i < str.length(); i++) {
			/*char c=str.charAt(i);
			System.out.print(c);
			System.out.println();*/
			char s=str.charAt(str.length()-1-i);
			System.out.print(s);
			
		}
		
		char arr[]=str.toCharArray();
		for(char X:arr){
			System.out.print(X);
		}
		
	}
}
