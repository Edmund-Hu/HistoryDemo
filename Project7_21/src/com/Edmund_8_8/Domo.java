package com.Edmund_8_8;

import java.io.File;

public class Domo {
	private void mian() {
	String path="D:/text/100.txt";
	File file = new File(path);
	if(file.exists()){
		System.out.println(file.length());
	}else{
		
		}
	}
}
