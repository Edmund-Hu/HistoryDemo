package com.Edmund_8_3;

import java.util.*;


public class NewsDB_ArrayList {
	public static void main(String[] args) {
		NewsTitle newsTitle1= new NewsTitle(8003, "火车", "卢旭", new Date());
		NewsTitle newsTitle2=new NewsTitle(8002, "南海事件", "Edmund", new Date());
		NewsTitle newsTitle3=new NewsTitle(8001, "关于手机如何找回", "Alex", new Date());
		NewsTitle firstnews = new NewsTitle(8008, "钓鱼岛是中国的", "卢旭", new Date());
		List<NewsTitle> list=new ArrayList<>();
		list.add(newsTitle1);
		list.add(newsTitle2);
		list.add(newsTitle3);
		
		//增加头条新闻
		list.add(0, firstnews);
		list.add(list.size(),firstnews);
		//删除最后一条
		//list.remove(list.size()-1);
		System.out.println("新闻条数是："+list.size());
		print(list);
		//查找
	if(list.contains(newsTitle2)){
		System.out.println("有南海的标题");
	}else{
		System.out.println("没有");
	}
	
		
		
		
	}
	
	public static void print(List<NewsTitle> list){
		//ArrayList<NewsTitle> list1 =(ArrayList<NewsTitle>)list;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getTitleName());
			//System.out.println(list.get(i).getCreatDate());
		}
	}
	
	/*public static void print(ArrayList<NewsTitle> list){
		//ArrayList<NewsTitle> list1 =(ArrayList<NewsTitle>)list;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getTitleName());
		}
	}*/
}
