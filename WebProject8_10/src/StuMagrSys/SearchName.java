package StuMagrSys;

import java.util.Scanner;

public class SearchName {
	public static void srName() {
		Scanner SC = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ��ѧ��������֧��ģ����ѯ");
		String SearchName = SC.next();
		String sql="select * from stu where name like "+"'"+"%"+SearchName+"%"+"'";
		if(Show.Sheach(sql)){
			System.out.println("��ѯ��ϣ���Ϣ����");
			Show.Showdetail(sql);
			System.out.println();
			System.out.println("�Ƿ������ѯ��y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				srName();
			} else {
				Search.menuSearch();
			}
			
		}
		else{
			System.out.println("û���ҵ������Ϣ����ȷ����������");
			System.out.println();
			System.out.println("�Ƿ������ѯ��y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				srName();
			} else {
				Search.menuSearch();
			}
			
		}
	}
}
