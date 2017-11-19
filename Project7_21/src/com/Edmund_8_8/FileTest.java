package com.Edmund_8_8;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file=new File("D:/test/newtxt3.txt");
		File file2=new File("D:/test","8.txt");
		File file3=new File("D:/test1","8.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	/*	try {
			file.createNewFile();
			System.out.println("创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*try {
			File file3=file.createTempFile("tem", "txt",file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//file.delete();
		System.out.println(file.equals(file2));
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.hashCode());
		System.out.println(file2.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file.mkdir();//创建文件夹
		file3.mkdirs();//创建文件夹，和文件，如果父路径不存在，创建一个父路径
		file.renameTo(file2);
		
		
		for(int i=1;i<6;i++){
			//StringBuilder str= new StringBuilder();	
			String str="D:/test/txt"+i+".txt";
			//System.out.println(str);
			File file4=new File(str);
			try {
				file4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
}
