package com.Edmund_8_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderDomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\test\\test\\1.txt");
		try {
			Reader rd= new FileReader(file);
			BufferedReader bfr=new BufferedReader(rd);
			String str;
			long start=System.nanoTime();
			while((str=bfr.readLine()) != null){
				System.out.println(str);
			}
			long end=System.nanoTime();
			System.out.println(end-start);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
