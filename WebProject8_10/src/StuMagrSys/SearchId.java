package StuMagrSys;

import java.util.Scanner;

public class SearchId {
	public static void Srid() {
		Scanner SC = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ��ѧ��ѧ�ţ�");
		String SearchID = SC.next();
		String sql="select * from stu where id="+SearchID;
		if(Show.Sheach(sql)){
			System.out.println("��ѯ��ϣ���Ϣ����");
			Show.Showdetail(sql);
			System.out.println();
			System.out.println("�Ƿ������ѯ��y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				Srid();
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
				Srid();
			} else {
				Search.menuSearch();
			}
			
		}
			
		
	}
}
