package com.Edmund_7_27;

public class Student {
	
	String name;
	String id;
	Subject softwareBasic = new Subject();
	Subject progamLanguge = new Subject();
	Subject databaseBasic = new Subject();
	
	public Student(){
		softwareBasic.name="软件技术基础";
		progamLanguge.name="编程逻辑语言Java";
		databaseBasic.name="数据库基础";			
	}
	public static double max1(Student[] stu){
		double max1=0;
		for(int i=0;i<stu.length;i++){
			if(max1<stu[i].softwareBasic.score)	{
				max1=stu[i].softwareBasic.score;
			}
		}
		return max1;
	}
	public static double max2(Student[] stu){
		double max2=0;
		for(int i=0;i<stu.length;i++){
			if(max2<stu[i].progamLanguge.score)	{
				max2=stu[i].progamLanguge.score;
			}
		}
		return max2;
		
	}
	
	public static double max3(Student[] stu){
		double max3=0;
		for(int i=0;i<stu.length;i++){
			if(max3<stu[i].databaseBasic.score)	{
				max3=stu[i].databaseBasic.score;
			}
		}
		return max3;
	}
/*	public static double min(double[] a){
		double min=0;
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		return min;
	}*/
	
}
