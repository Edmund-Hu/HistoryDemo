package com.Edmund_8_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class ImportDoubleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\test\\txt2.txt");
		Reader in=null;
		BufferedReader bfin=null;
		try {
			 in= new FileReader(file);
			 bfin=new BufferedReader(in);
			 String str;
			 String s;		
			 ArrayList<Double> arrlist=new ArrayList<>();
			 int i=0;
			 while(((str=bfin.readLine())!=null)){
				 s=str.trim();
				 arrlist.add(Double.parseDouble(s));
			 }
			 Double[] arr=new Double[arrlist.size()];
			 arr=arrlist.toArray(new Double[0]);
			 for(double x:arr){
				 System.out.println(x);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bfin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
