package com.edmund.dao;

import java.util.List;

public class FilelocationTest {
	public static void main(String[] args) {
		FileLocationDao f = new FileLocationDao();
		//System.out.println(f.setPath("xxx"));
		//System.out.println(f.getPath("xxx"));
		List<String> list =f.getPaths();
		for(String s:list){
			System.out.println(s);
		}
	}
}
