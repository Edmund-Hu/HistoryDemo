package com.Edmund_8_8;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

import javax.sound.midi.SysexMessage;

public class WriterDomo {

	public static void main(String[] args) {
		File file=new File("D:\\test\\test\\2.txt");
		Writer out=null;
		try {
			 out= new FileWriter(file);
			 long start=System.nanoTime();
			 String s="jajdslkjald �ο���Ƶ������ط����Ͽ�";
			//char[] ch=new char[1024];
			// ch=s.toCharArray();
				out.write(s);
				out.append("sda");
				out.flush();//ˢ��
				 long end=System.nanoTime();
		//	System.out.println(start);	
			System.out.println(end-start);	
				System.out.println("����ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
