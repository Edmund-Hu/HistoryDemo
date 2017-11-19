package com.Edmund_8_3;

import java.util.LinkedList;
import java.util.List;

public class PrintList {
	public static  void print(List<NewsTitle> list){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).getTitleName()+"\t");
			System.out.print(list.get(i).getId()+"\t");
			System.out.print(list.get(i).getCreater()+"\t");
			System.out.println(list.get(i).getCreatDate());
		}
		System.out.println(((LinkedList<NewsTitle>)list).getFirst().getTitleName());
	}
}
