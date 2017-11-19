package com.Edmund_7_28;

public class Book_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book B = new Book("Java入门到精通",100);
		Book B1= new Book();
		B1.setTitle("Java");
		B1.setpageNum(100);
		B.detail();
	}

}

