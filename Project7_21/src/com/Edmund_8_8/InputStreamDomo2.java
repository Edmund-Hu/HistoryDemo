package com.Edmund_8_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDomo2 {

	public static void main(String[] args) {
		File file=new File("D:/test/txt1.txt");
		try {
			InputStream in=new FileInputStream(file);
			int In=0;
				while((In=in.read())!=-1){
					System.out.print((char)In);
				System.out.println("="+In);	
				}
				}
		
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		}
		}
		
		

	}


