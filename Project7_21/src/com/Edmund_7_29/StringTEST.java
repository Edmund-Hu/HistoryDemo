package com.Edmund_7_29;

import java.util.Date;
import java.util.StringTokenizer;



public class StringTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String str1="hello";
		String str2="word";
		String str3=new String("hello");
		char[] c= str1.toCharArray();
		System.out.println(str2.valueOf(c));
		
		String str4="hhee";
		String str5="hwle";
		System.out.println(str4.compareTo(str5));
		
		String str="this is a test";
		System.out.println(str.indexOf("i"));
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.indexOf("i", 7));
	
		
		String str6="123";
		System.out.println(Integer.parseInt(str6));	
		System.out.println(String.valueOf(345.23));
		
		Date date=new Date();	
		System.out.println(date.toString());*/
		
		String s="I am Edmund, She is my girlfriend";
		StringTokenizer fenxi= new StringTokenizer(s," ,");
		int number =fenxi.countTokens();
		while(fenxi.hasMoreTokens()){
			String temp=fenxi.nextToken();
			System.out.println(temp);
			System.out.println("剩下的单词是"+fenxi.countTokens());
		
		}
		System.out.println("总的单词书是"+number);
		
		byte d[]="你我他".getBytes();
		String stra= new String(d,0,2);
		for(byte x:d){
			System.out.println(x);
		}
		System.out.println(d.length);
		System.out.println(stra);
		
		StringBuffer sb= new StringBuffer("abcdefghijklmn");
	
		sb.append("opqsrt");
		System.out.println(sb.reverse());
		
		String stt=sb.toString();
	
		System.out.println(stt);
		
		String ttString="18680993689";
		String regex="^(13[0-9]|14[578]|15[0-9]|17[78]|18[0-9])\\d{8}$";
		System.out.println(ttString.matches(regex));
		
	}

}
