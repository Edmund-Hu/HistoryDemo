package com.edmund.dao;

import java.util.List;

public class FileNameTest {
	public static void main(String[] args) {
		FileNameDao f = new FileNameDao();
		System.out.println(f.setPath("xxx"));
		//System.out.println(f.getPath("xxx"));
		List<String> list =f.getPaths();
		for(String s:list){
			System.out.println(s);
		}
	}
}
