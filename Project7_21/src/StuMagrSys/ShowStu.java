package StuMagrSys;

import java.util.Scanner;

public class ShowStu {

	public static void show(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		System.out.println("����ѧ����ϢΪ��");
		for (int i = 0; i < count; i++) {
			System.out.println("����:" + stu[i].getName() + ",ѧ�ţ�"
					+ stu[i].getID() + ", �Ա�" + stu[i].getSex() + ",�ɼ���"
					+ stu[i].getScore());
		}
		System.out.println("�Ƿ����������һ����y/n");

		String ans = SC.next();
		if (ans.equalsIgnoreCase("y")) {
			Search.menuSearch(stu, count);
		}else{
			ShowStu.show(stu, count);
		}
	}
}
