package com.Edmund_8_3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Collections_tst {
	public static void main(String[] args) {
		List<Integer>list =new ArrayList<>();
		list.add(new Integer(9));
		list.add(new Integer(10));
		list.add(new Integer(3));
		list.add(new Integer(7));
		
		Collections.sort(list);
		
		for(Integer x:list){
			System.out.println(x);
		}
	}
}
