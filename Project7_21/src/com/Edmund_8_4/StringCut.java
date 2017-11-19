package com.Edmund_8_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringCut {
	public void mySubString(String str,String start,String end){
		StringBuffer sbf=new StringBuffer(str);
		LinkedList<String> arrlist=new LinkedList<>();
		int st=sbf.indexOf(start);
		int ed=sbf.indexOf(end)+1;
		if(st!=-1&&ed!=-1&&st<=ed){
			String rstr=sbf.substring(st, ed);
			arrlist.addLast(rstr);;
			str=sbf.substring(ed);
			mySubString(str, start, end);
		}
		String[] newStrings= arrlist.toArray(new String[0]);
		for(String x:newStrings){
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		String str="mksjdnjjdmenkjksjdndsd";
		String start="m";
		String end="n";
		StringCut scutCut=new StringCut();
		scutCut.mySubString(str, start, end);
	}
}
