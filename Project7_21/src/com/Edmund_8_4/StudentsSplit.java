package com.Edmund_8_4;

//import java.util.ArrayList;

public class StudentsSplit {
	public static void main(String[] args) {
		String stuName="Jone,Skyy,Peter,Johnson,Jason";
		//ArrayList<String> arrlist=new ArrayList<>();
		String[] arrStu=stuName.split(",");
		for(String x:arrStu){
			System.out.println(x);
		}
		String s="Tomcat";
		boolean flag=false;
		for(int i=0;i<arrStu.length;i++){
			if(s.equals(arrStu[i])){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("学生名单里有"+s);	
		}else{
			System.out.println("学生名单里没有"+s);
		}
	}
}
