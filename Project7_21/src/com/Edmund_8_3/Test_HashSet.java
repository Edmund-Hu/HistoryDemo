package com.Edmund_8_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_HashSet {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(new Integer(9));
		set.add(new Integer(10));
		set.add(new Integer(3));
		set.add(new Integer(7));
		set.add(new Integer(3));
		set.add(new Integer(6));
		Iterator<Integer> it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
