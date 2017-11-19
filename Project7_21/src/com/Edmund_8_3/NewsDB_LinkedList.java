package com.Edmund_8_3;

import java.util.Date;
import java.util.LinkedList;
//import java.util.List;

public class NewsDB_LinkedList {
	public static void main(String[] args) {
		NewsTitle newsTitle1 = new NewsTitle(8003, "火车", "卢旭", new Date());
		NewsTitle newsTitle2 = new NewsTitle(8002, "南海事件", "Edmund", new Date());
		NewsTitle newsTitle3 = new NewsTitle(8001, "关于手机如何找回", "Alex",
				new Date());
		//NewsTitle firstnews = new NewsTitle(8008, "钓鱼岛是中国的", "卢旭", new Date());
		LinkedList<NewsTitle> list = new LinkedList<>();
		list.add(newsTitle1);
		list.addFirst(newsTitle2);
		list.addLast(newsTitle3);
		
		PrintList.print(list);
		System.out.println("------------删除头条-----------");
		list.removeFirst();
		list.removeLast();
		PrintList.print(list);

	}
}
