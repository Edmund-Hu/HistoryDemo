package com.Edmund_8_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutStreamDomo6 {
public static void main(String[] args) {
	

		// TODO Auto-generated method stub
		//������ϵ
		File file1= new File("D:/test/Test");
		if(!file1.exists()){
	
				file1.mkdirs();
		}
		//File file= new File("D:/test/test/1.txt");
		//ѡ����
		try {
			OutputStream out=new FileOutputStream(file1+"/1.txt");
			String s="�й��Ǿ�����˯�����뿪��ð����￴���Ӿͷ����oajds";
			byte bt[]=s.getBytes();
			out.write(bt);
			System.out.println("������");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("û���ҵ��ļ�");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block\\
			System.out.println("���ʧ��");
			e.printStackTrace();
		}
		
		
		
		
}
	}

