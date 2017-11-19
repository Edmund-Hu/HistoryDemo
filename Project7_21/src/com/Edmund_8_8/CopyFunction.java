package com.Edmund_8_8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class CopyFunction {

	public static void main(String[] args) {
		
		File f1 = new File("D:/test/test/1.txt");// 需要复制的文件1.txt；
		File f2 = new File("D:/test/test2/"+f1.getName());// 复制后的文件
		//System.out.println(File.separator);
		Reader in = null;
		Writer out = null;
		BufferedReader bfin=null;
		BufferedWriter  bfout=null;
		
		try {
			in = new FileReader(f1);
			out = new FileWriter(f2);
			bfin= new BufferedReader(in);
			bfout= new BufferedWriter(out);
			char [] ch = new char [1024];
			int In = 0;
			//String str;
			while ((In = bfin.read(ch)) != -1) {
				bfout.write(ch);
				
			}
			bfout.flush();
			System.out.println("复制完成");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
