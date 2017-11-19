package com.Edmund_8_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test_TreeSet {
	public static void main(String[] args) {
		
		Set<Integer> set=new TreeSet();
		int[] arr={5,7,15,3,4,3,10,14,1,2};
		for(int i=0; i<arr.length;i++){
			//Integer Arr=new Integer(arr[i]);
			set.add(arr[i]);
		}
		int[] arr2=new int[set.size()];
	
		Iterator<Integer> it=set.iterator();
		int i=0;
		while(it.hasNext()){		
			arr2[i]=it.next();
			i++;
		}
		for(int x:arr2){
			System.out.println(x);
		}
	}
	
}
