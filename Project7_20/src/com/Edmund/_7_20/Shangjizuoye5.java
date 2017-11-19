package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入学生成绩");
		Scanner sc = new Scanner(System.in);
		int score =sc.nextInt();
	/*	if(score>=90 && score<=100){
			System.out.println("该成绩为"+score+"等级为A");
		}else if (score>=80 && score<90){
			System.out.println("该成绩为"+score+"等级为B");
		}else if (score>=70 && score<80){
			System.out.println("该成绩为"+score+"等级为C");
		}else if (score>=60 && score<70){
			System.out.println("该成绩为"+score+"等级为D");
		}else if (score<60 && score>=0){
			System.out.println("该成绩为"+score+"等级为E");
		}else{
				System.out.println("输入成绩不合法！");
			}*/
		
		switch(score/10){
		case 10:
			System.out.println("该成绩为"+score+"等级为A");
			break;
		case 9:
			System.out.println("该成绩为"+score+"等级为A");
			break;
		case 8:
			System.out.println("该成绩为"+score+"等级为B");
			break;
		case 7:
			System.out.println("该成绩为"+score+"等级为C");
			break;
		case 6:
			System.out.println("该成绩为"+score+"等级为D");
			break;
		case 5:
			System.out.println("该成绩为"+score+"等级为E");
			break;
		case 4:
			System.out.println("该成绩为"+score+"等级为E");
			break;
		case 3:
			System.out.println("该成绩为"+score+"等级为E");
			break;
		case 2:
			System.out.println("该成绩为"+score+"等级为E");
			break;
		case 1:
			System.out.println("该成绩为"+score+"等级为E");
			break;
		case 0:
			System.out.println("该成绩为"+score+"等级为D");
			break;
	   default:
			System.out.println("输入成绩不合法！");
			break;
		
			
		}
		
		}
	}



