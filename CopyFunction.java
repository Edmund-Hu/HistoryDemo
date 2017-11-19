package com.Edmund_8_9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class CopyFunction {
public static void copy(File f1, File f2){
	
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bfin=null;
		BufferedOutputStream  bfout=null;
		
		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			bfin= new BufferedInputStream(in);
			bfout= new BufferedOutputStream(out);
			byte [] bt = new byte [1024];
			int In = 0;
			while ((In = bfin.read(bt)) != -1) {
				bfout.write(bt);
				
			}
			bfout.flush();
			//System.out.println("¸´ÖÆÍê³É");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				bfout.close();
				bfin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
