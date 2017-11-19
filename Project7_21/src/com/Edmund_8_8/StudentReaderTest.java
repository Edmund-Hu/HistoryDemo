package com.Edmund_8_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;



public class StudentReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\test\\txt3.txt");
		Reader in=null;
		BufferedReader bfin=null;
		try {
			 in= new FileReader(file);
			 bfin=new BufferedReader(in);
			 String str;
			 String s;
			
			 ArrayList<String> arrlist=new ArrayList<>();
			 
			 while(((str=bfin.readLine())!=null)){
				 s=str.trim();
				// System.out.println(s);
				 arrlist.add(s);
			 }
		
			 String[][] strarr=new String[arrlist.size()][5];
			 for(int i=0;i<strarr.length;i++){
				 //for(int j=0;j>strarr[i].length;j++){
					 strarr[i]=arrlist.get(i).split("(\\s)+");
				// }
			 }
			 Students[] stu=new Students[strarr.length];
			 for(int i=1;i<strarr.length;i++){
				 stu[i]=new Students(strarr[i][0], strarr[i][1], Double.parseDouble(strarr[i][2]),  Double.parseDouble(strarr[i][3]),  Double.parseDouble(strarr[i][4]));
				
			//System.out.println(stu[1][3].getscoreTotal);
			 }
			 
	/*	for(String x:strarr[1]){
			System.out.println(x);
		}*/
		/*	 for(String[] x:strarr){
				 for(String y:x){
					 System.out.println(y);
				 }
			 }*/
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
