package com.Edmund_8_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadChnieseCode {

	public static void main(String[] args) {
		//建立联系
		String path="D:/test/txt1.txt";
		File file= new File(path);
		//选择流（输入流）；
		InputStream in=null;//提高作用域
		//操作流
		try {
			in=new FileInputStream(file);
			//byte bt[]=new byte[1];
			int In=0;
			while(-1!=(In=in.read())){
				if(In>127||In<0){
					byte b[]=new byte[2];
					b[0]=(byte)In;
					b[1]=(byte)in.read();
					String s =new String(b);
					System.out.print(s);
				}else{
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到文件");
			e.printStackTrace();
		}catch(IOException e){
		System.out.println("读取失败");
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("关闭异常，关闭失败");
				e.printStackTrace();
			}
		}
		
	}

}
