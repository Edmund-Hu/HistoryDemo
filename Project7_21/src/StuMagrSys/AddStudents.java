package StuMagrSys;

import java.util.Scanner;

public class AddStudents {
	public static  void Addstu(Students[] stu){
		System.out.println("��ӭ����ѧ�����ϵͳ");
		Scanner SC =new Scanner(System.in);
		for(int i=5;i<stu.length;){
			stu[i]=new Students();
			System.out.println("������ѧ��ѧ��");
			String ID =SC.next();	
			System.out.println("������ѧ������");
			String name =SC.next();	
			System.out.println("������ѧ���Ա�");
			String s =SC.next();
			char sex=s.charAt(0);
			System.out.println("������ѧ���ɼ�");
			Input input=new Input();
			input.Score();
			double score =Input.score;
			System.out.println("ȷ��Ҫ�����y/n");
			String ans= SC.next();
			if(ans.equalsIgnoreCase("y")){
				stu[i].setID(ID);
				stu[i].setName(name);
				stu[i].setSex(sex);
				stu[i].setScore(score);
				System.out.println("��ӳɹ���");
				i++;
				MainPage.count++;
			}else{
				System.out.println("�������");
			}
			System.out.println("������ӣ�y/n");
			String ans2= SC.next();
			if(ans2.equalsIgnoreCase("n")){
				MainPage.MianPage();
				break;
			}else{
				continue;
			}
		
		}
	}
}
