package com.Edmund_8_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDomo {

	public static void main(String[] args) {
		//������ϵ
		String path="D:/test/txt1.txt";
		File file= new File(path);
		//ѡ����������������
		InputStream in=null;//���������
		//������
		try {
			in=new FileInputStream(file);
			byte bt[]=new byte[200];
			int In=0;
			while(-1!=(In=in.read(bt))){
				String s=new String(bt,0,bt.length);
				//String s=bt.toString();��ַ
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�Ҳ����ļ�");
			e.printStackTrace();
		}catch(IOException e){
		System.out.println("��ȡʧ��");
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�ر��쳣���ر�ʧ��");
				e.printStackTrace();
			}
		}
		
	}

}
