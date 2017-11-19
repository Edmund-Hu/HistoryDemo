package com.Edmund_8_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutStreamDomo6 {
public static void main(String[] args) {
	

		// TODO Auto-generated method stub
		//建立联系
		File file1= new File("D:/test/Test");
		if(!file1.exists()){
	
				file1.mkdirs();
		}
		//File file= new File("D:/test/test/1.txt");
		//选择流
		try {
			OutputStream out=new FileOutputStream(file1+"/1.txt");
			String s="中国呵经历快睡觉爱离开多久啊阿里看电视就罚款的oajds";
			byte bt[]=s.getBytes();
			out.write(bt);
			System.out.println("完成输出");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到文件");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block\\
			System.out.println("输出失败");
			e.printStackTrace();
		}
		
		
		
		
}
	}

