package com.Edmund_8_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterDomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("D:\\test\\test\\3.txt");
		Writer writer=null;
		BufferedWriter bfWriter=null;
		try {
			writer = new FileWriter(file);
			 bfWriter= new BufferedWriter(writer);
			String str="skjakjs lksj asd 上帝是公平的，睡觉是解决不了问题的";
			bfWriter.write(str);
			bfWriter.flush();
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bfWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
	}

}
