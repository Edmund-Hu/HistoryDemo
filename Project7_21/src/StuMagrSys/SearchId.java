package StuMagrSys;

import java.util.Scanner;

public class SearchId {
	public static void Srid(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		boolean flag = false, found = false;
		do {
			System.out.println("��������Ҫ��ѯ��ѧ��ѧ�ţ�");
			String SearchID = SC.next();
			for (int i = 0; i < count; i++) {
				if (SearchID.equals(stu[i].getID())) {
					System.out.println("ѧ��Ϊ" + SearchID + "��ѧ������Ϊ��"
							+ stu[i].getName() + ", �Ա�Ϊ��" + stu[i].getSex()
							+ ",�ɼ�Ϊ��" + stu[i].getScore());
					found = true;
					break;
				} else {
					found = false;
				}
			}
			if (!found) {
				System.out.println("δ�ҵ�ѧ��Ϊ��" + SearchID + "��ѧ����Ϣ");
			}
			System.out.println("�Ƿ������ѯ��y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag = true;
			} else {
				Search.menuSearch(stu, count);
			}
		} while (flag);
	}
}
