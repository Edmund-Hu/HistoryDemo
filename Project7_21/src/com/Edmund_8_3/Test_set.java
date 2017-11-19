package com.Edmund_8_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_set {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("Word");
		String s3=new String("天气");
		String s4=new String("tiantian");
		Set<String> set=new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		//输出大小
		System.out.println(set.size());
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
