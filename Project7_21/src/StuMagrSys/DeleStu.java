package StuMagrSys;

import java.util.Scanner;

public class DeleStu {
	public static void delStu(Students[] stu,int count){
		Scanner SC = new Scanner(System.in);
		int count2=count;
		boolean flag = false, found = false;
		do {System.out.println("����ѧ����ϢΪ��");
		for (int i = 0; i < count2; i++) {
			System.out.println("����:" + stu[i].getName() + ",ѧ�ţ�"
					+ stu[i].getID() + ", �Ա�" + stu[i].getSex() + ",�ɼ���"
					+ stu[i].getScore());
		}
		
			System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
			String SearchID = SC.next();
			for (int i = 0; i < count2; i++) {
				if (SearchID.equals(stu[i].getID())) {
					System.out.println("Ҫɾ����ѧ��ѧ��Ϊ" + SearchID + "������Ϊ��"
							+ stu[i].getName() + ", �Ա�Ϊ��" + stu[i].getSex()
							+ ",�ɼ�Ϊ��" + stu[i].getScore());
					found = true;
					System.out.println("ȷ��ɾ����y/n");
					String ans2 = SC.next();
					if( ans2.equalsIgnoreCase("y")){
						for(int j=i;j<count2-1;j++){
							stu[j].setID(stu[j+1].getID());
							stu[j].setName(stu[j+1].getName());
							stu[j].setSex(stu[j+1].getSex());
							stu[j].setScore(stu[j+1].getScore());
						}
						count2--;
						MainPage.count-=1;
						System.out.println("ɾ���ɹ���");	
					}
					
					break;
				} else {
					found = false;
				}
			}
			if (!found) {
				System.out.println("δ�ҵ�ѧ��Ϊ��" + SearchID + "��ѧ����Ϣ");
			}
			System.out.println("�Ƿ����ɾ����y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag = true;
			} else {
				MainPage.MianPage();
			}
		} while (flag);
	}
}
