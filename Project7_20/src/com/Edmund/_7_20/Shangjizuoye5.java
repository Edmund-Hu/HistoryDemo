package com.Edmund._7_20;

import java.util.Scanner;

public class Shangjizuoye5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ѧ���ɼ�");
		Scanner sc = new Scanner(System.in);
		int score =sc.nextInt();
	/*	if(score>=90 && score<=100){
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪA");
		}else if (score>=80 && score<90){
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪB");
		}else if (score>=70 && score<80){
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪC");
		}else if (score>=60 && score<70){
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪD");
		}else if (score<60 && score>=0){
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
		}else{
				System.out.println("����ɼ����Ϸ���");
			}*/
		
		switch(score/10){
		case 10:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪA");
			break;
		case 9:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪA");
			break;
		case 8:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪB");
			break;
		case 7:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪC");
			break;
		case 6:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪD");
			break;
		case 5:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
			break;
		case 4:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
			break;
		case 3:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
			break;
		case 2:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
			break;
		case 1:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪE");
			break;
		case 0:
			System.out.println("�óɼ�Ϊ"+score+"�ȼ�ΪD");
			break;
	   default:
			System.out.println("����ɼ����Ϸ���");
			break;
		
			
		}
		
		}
	}



