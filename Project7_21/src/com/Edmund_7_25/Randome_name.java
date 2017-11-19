package com.Edmund_7_25;

import java.util.Random;
import java.util.Scanner;

public class Randome_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a[]=new boolean[37];
		boolean flag=true;
		int count=0;
		while(flag){
		
		String name[]={"黄俊丰","邓忠","李昆","刘洪林","王杨帆","胡德鹏","何青霖","杨世杰",
				"黄治川","魏巍","汪孝海","尤跃","侯博","徐朝成","谯嘉逸","熊伟",
				"王元东","陈世文","李永潇","陈军先","张继丰","何祥源","邓炜",
				"陈华华","卢旭","黄刚","王培","聂常作","熊杨盼","余靖","马良",
				"寇含尧","冯帅","熊国栋","张伟","邓盛豪","刘绍林"};
		boolean aa=false;
		
		do{
		Random  r = new Random();
		int stu =Math.abs(r.nextInt());
		int st = stu%37;//产生0-36之间的数
	
		if(count<36){
		if (a[st]==true){
			aa=true;
		}else{
			aa=false;
		System.out.println("恭喜"+name[st]+"同学中奖");
		a[st]=true;
		count++;
			}
		}else{
			System.out.println("同学已经抽完，程序自动退出，请重新运行程序");
			System.exit(0);
		}
		}while(aa);
	System.out.println("还要继续吗？y/n");
		Scanner sc=new Scanner(System.in);
		String answer=sc.next();
		if(answer.equals("y")){
		flag=true;
		
	}else{
		flag=false;
				}
	}

}
	}
