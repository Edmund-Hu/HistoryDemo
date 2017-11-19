package com.Edmund_8_3;

import java.util.HashMap;
import java.util.Map;

public class Book_Test {

	public static void main(String[] args) {
		Book b1= new Book("JAVA 入门到精通");
		Book b2= new Book("JAVA 疯狂讲义");
		Book b3= new Book("JAVA 编程思想");	
		
		Map<String, Book> hmap=new HashMap<>();
		hmap.put("", b1);
		hmap.put("002", b2);
		hmap.put("003", b3);
		System.out.println("编号为001的书籍title是："+hmap.get("001"));
	}

}
