package StuMagrSys;

import java.util.Scanner;

public class ModifStu {
	public static void modstu(Students[] stu, int count) {
		System.out.println("����ѧ����ϢΪ��");
		for (int i = 0; i < count; i++) {
			System.out.println("����:" + stu[i].getName() + ",ѧ�ţ�"
					+ stu[i].getID() + ", �Ա�" + stu[i].getSex() + ",�ɼ���"
					+ stu[i].getScore());
		}
		Scanner SC = new Scanner(System.in);
		boolean found = false;
		System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		String SearchID = SC.next();
		for (int i = 0; i < count; i++) {
			if (SearchID.equals(stu[i].getID())) {
				System.out.println("ѧ��Ϊ" + SearchID + "��ѧ������Ϊ��"
						+ stu[i].getName() + ", �Ա�Ϊ��" + stu[i].getSex()
						+ ",�ɼ�Ϊ��" + stu[i].getScore());
				found = true;
				System.out.println("������ѧ���µ�������ԭ����Ϊ" + stu[i].getName());
				String name = SC.next();
				System.out.println("������ѧ���µķ�����ԭ����Ϊ" + stu[i].getScore());
				Input input=new Input();
				input.Score();
				double score =Input.score;
				System.out.println("ȷ���޸ģ�y/n");
				String ans = SC.next();
				if (ans.equalsIgnoreCase("y")) {
					stu[i].setName(name);
					stu[i].setScore(score);
					System.out.println("�޸ĳɹ����Ƿ�����޸ģ�y/n");
					String ans2 = SC.next();
					if (ans2.equalsIgnoreCase("y")) {
						ModifStu.modstu(stu, count);
					} else {
						MainPage.MianPage();
					}
				}

				break;
			} else {
				found = false;
			}
		}
		if (!found) {
			System.out.println("δ�ҵ�ѧ��Ϊ��" + SearchID + "��ѧ����Ϣ,����������");
			ModifStu.modstu(stu, count);
		}

	}
}
