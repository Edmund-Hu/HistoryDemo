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
		
		String name[]={"�ƿ���","����","����","������","���","������","������","������",
				"���δ�","κΡ","��Т��","��Ծ","�","�쳯��","�ۼ���","��ΰ",
				"��Ԫ��","������","������","�¾���","�ż̷�","����Դ","���",
				"�»���","¬��","�Ƹ�","����","������","������","�ྸ","����",
				"�ܺ�Ң","��˧","�ܹ���","��ΰ","��ʢ��","������"};
		boolean aa=false;
		
		do{
		Random  r = new Random();
		int stu =Math.abs(r.nextInt());
		int st = stu%37;//����0-36֮�����
	
		if(count<36){
		if (a[st]==true){
			aa=true;
		}else{
			aa=false;
		System.out.println("��ϲ"+name[st]+"ͬѧ�н�");
		a[st]=true;
		count++;
			}
		}else{
			System.out.println("ͬѧ�Ѿ����꣬�����Զ��˳������������г���");
			System.exit(0);
		}
		}while(aa);
	System.out.println("��Ҫ������y/n");
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
