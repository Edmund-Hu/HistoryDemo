package com.Edmund_7_25;

import java.util.Random;
import java.util.Scanner;

public class Test_Random01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		//�������ŵ�������
		String[] name = {"�ƿ���", "����", "����", "������", "���﷫", "������",
				"������", "������", "���δ�", "κΡ", "��Т��", "��Ծ", "�", "�쳯��", "�ۼ���", "��ΰ",
				"��Ԫ��", "������", "������", "�¾���", "�ż̷�", "����Դ", "���", "�»���", "¬��", "�Ƹ�",
				"����", "������", "������", "�ྸ", "����", "�ܺ�Ң", "��˧", "�ܹ���", "��ΰ", "��ʢ��",
				"������"};
		//System.out.println(name.length);
		boolean flag = true;
		System.out.println("���������ȡ������������");
		while(flag){
			Random random = new Random();//��ȡ�������
			int num1 = random.nextInt();//�õ�һ�������
			int num2 = Math.abs(num1);//����������һ������
			int num3 = num2%37;//����������0-35֮��
			System.out.println("��ϲ��"+name[num3]+" ��Ա����ɹ�");
			System.out.println("����Ҫ����ô��y/n");
			answer = sc.next();
			if(!answer.equalsIgnoreCase("y")){
				flag = false;
				System.out.println("������ȡ������������");
				//break;
			}
			//System.out.println(num3);
			//System.out.println(name[num3]);
		}
		
	}

}
