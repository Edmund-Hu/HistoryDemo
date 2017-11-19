package com.Edmund_8_3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CatTest {

	public static void main(String[] args) {
		Cat cat1=new Cat("ίχίχ1");
		Cat cat2=new Cat("ίχίχ2");
		Cat cat3=new Cat("ίχίχ3");
		Cat cat4=new Cat("ίχίχ4");
		
		List<Cat> list=new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		list.add(cat3);
		list.add(cat4);
		//list.set(2, cat1);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).show());
		}
		
		Iterator<Cat> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().show());
		}
		
		
	}

}
