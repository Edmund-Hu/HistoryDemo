package com.Edmund_8_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.naming.ldap.Rdn;

public class ReaderDomo {

	public static void main(String[] args) {
	File file= new File("D:\\test\\test\\1.txt");	
	Reader rd=null;
	try {
		rd= new FileReader(file);
		char[] ch= new char[10];
		int In=0;
		long start=System.nanoTime();
		while((In=rd.read(ch)) != -1){
			System.out.println(ch);
		}
		long end=System.nanoTime();
		System.out.println(end-start);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}

}
