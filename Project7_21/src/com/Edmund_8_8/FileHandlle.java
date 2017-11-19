package com.Edmund_8_8;

import java.io.File;

public class FileHandlle {
	public static void main(String[] args) {
		File file=new File("D:\\test");
	int fileCount=0;
	int DirCount=0;
		File[] arrFiles=file.listFiles();
		for(int i=0;i<arrFiles.length;i++){
			if(arrFiles[i].isDirectory()){
				DirCount++;
			}else{
				fileCount++;
			}
		}
		System.out.println("文件夹个数为："+DirCount);
		
		System.out.println("文件个数为："+fileCount);
		
	}
}
