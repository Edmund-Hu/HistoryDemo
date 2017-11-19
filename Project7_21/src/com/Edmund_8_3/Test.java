package com.Edmund_8_3;

import java.util.ArrayList;
import java.util.Date;

import com.Edmund_7_28_Shangji.Employee;

import StuMagrSys.MainPage;

public class Test {
	public static void main(String[] arge){
		NewsTitle news1= new NewsTitle(1, "汽车", "小白1", new Date());
		NewsTitle news2= new NewsTitle(2, "范冰冰", "小白2", new Date());
		NewsTitle news3= new NewsTitle(2, "香蕉", "小白3", new Date());
		ArrayList list = new ArrayList();
		list.add(news1);
		list.add(news2);
		list.add(news3);
		//list.remove(2);
		//求集合元素个数
		System.out.println("集合元素个数为："+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(((NewsTitle)list.get(i)).getTitleName());
		}
		
		
	}
}
