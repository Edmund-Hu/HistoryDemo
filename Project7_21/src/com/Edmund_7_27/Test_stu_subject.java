package com.Edmund_7_27;

import java.util.Scanner;

public class Test_stu_subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu= new Student[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<stu.length;i++){
			stu[i]= new Student();
			System.out.println("�������"+(i+1)+"λͬѧ����Ϣ");
			System.out.println("ѧ�ţ�");
			stu[i].id =sc.next();
			System.out.println("������");
			stu[i].name=sc.next();
			System.out.println("������������ɼ���");
			stu[i].softwareBasic.score=sc.nextDouble();
			System.out.println("�����߼����Գɼ���");
			stu[i].progamLanguge.score=sc.nextDouble();
			System.out.println("���ݿ�����ɼ���");
			stu[i].databaseBasic.score=sc.nextDouble();
			System.out.println("***************");
		}
		
		double sumScore1 = 0, sumScore2 = 0, sumScore3 = 0,
				max1=stu[0].softwareBasic.score				,
				min1=stu[0].softwareBasic.score,
				max2,min2,max3,min3;
		max1=Student.max1(stu);
		max2=Student.max2(stu);
		max3=Student.max3(stu);
		
		double avg1 = sumScore1 / stu.length;
		double avg2 = sumScore2 / stu.length;
		double avg3 = sumScore3 / stu.length;
	
		
		System.out.println("���������������ƽ���֣�" + avg1+"��߷ֺ���ͷ��ǣ�"+max2+"\t"+min1);
		System.out.println("�������߼�����java��ƽ���֣�" + avg2);
		System.out.println("�����ݿ������ƽ���֣�" + avg3);


		
	}

}
