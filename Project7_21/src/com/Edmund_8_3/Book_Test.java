package com.Edmund_8_3;

import java.util.HashMap;
import java.util.Map;

public class Book_Test {

	public static void main(String[] args) {
		Book b1= new Book("JAVA ���ŵ���ͨ");
		Book b2= new Book("JAVA �����");
		Book b3= new Book("JAVA ���˼��");	
		
		Map<String, Book> hmap=new HashMap<>();
		hmap.put("", b1);
		hmap.put("002", b2);
		hmap.put("003", b3);
		System.out.println("���Ϊ001���鼮title�ǣ�"+hmap.get("001"));
	}

}
