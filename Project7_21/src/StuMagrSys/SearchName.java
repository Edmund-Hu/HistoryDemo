package StuMagrSys;

import java.util.Scanner;

public class SearchName {
	public static void srName(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		boolean flag1 = false, found1 = false;
		do {
			System.out.println("��������Ҫ��ѯ��ѧ��������");
			String SearchName = SC.next();
			for (int i = 0; i < count; i++) {
				if (stu[i].getName().indexOf(SearchName)>=0) {
					System.out.println("����Ϊ" + stu[i].getName() + "��ѧ��ѧ��Ϊ��"
							+ stu[i].getID() + ", �Ա�Ϊ��" + stu[i].getSex()
							+ ",�ɼ�Ϊ��" + stu[i].getScore());
					found1 = true;
					//break;
				} else {
					//found1 = false;
				}
			}
			if (!found1) {
				System.out.println("δ�ҵ�����Ϊ��" + SearchName + "��ѧ����Ϣ");
			}
			System.out.println("�Ƿ������ѯ��y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag1 = true;
			} else {
				Search.menuSearch(stu, count);
			}
		} while (flag1);
	}
}
