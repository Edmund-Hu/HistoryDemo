package StuMagrSys;

import java.util.Scanner;

public class Search {
	public static void menuSearch(Students[] stu, int count) {
		System.out.println("\t" + "       ��ѡ���ѯ��ʽ������1~5");
		System.out.print("1:����ѧ�Ų�ѯ" + "\t");
		System.out.print("2:����������ѯ" + "\t");
		System.out.print("3:��ѯ����ѧ��" + "\t");
		System.out.print("4:�ɼ����а�" + "\t");
		System.out.println("5:������һ��" + "\t");
		Input input=new Input();
		input.input();
		switch (Input.ans) {
		case 1:
			SearchId.Srid(stu, count);
			break;
		case 2:
			SearchName.srName(stu, count);
			break;
		case 3:
			ShowStu.show(stu, count);
			break;
		case 4:
			SortStu.sort(stu, count);
			break;
		case 5:
			MainPage.MianPage();
			break;
		}
	}
}
