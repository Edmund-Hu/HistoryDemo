package StuMagrSys;

import java.util.Scanner;

public class DeleStu {
	public static void delStu(){
		Scanner SC = new Scanner(System.in);
		System.out.println("所有学生信息为：");
		Show.Showdetail();
		System.out.println("请输入需要删除的学生学号：");
		int SearchID = SC.nextInt();
		String sql="select * from stu where id="+SearchID;
		if(Show.Sheach(sql)){
			System.out.println("确认删除吗？y/n");
			String ans2 = SC.next();
			if( ans2.equalsIgnoreCase("y")){
				String sql2="delete from stu where id="+SearchID;
				Delete.del(sql2);
				System.out.println("是否继续删除？y/n");
				String ans = SC.next();
				if (ans.equalsIgnoreCase("y")) {
					delStu();
				} else {
					MainPage.MianPage();
				}
			}else{
				System.out.println("用户放弃删除");
				System.out.println("是否继续删除？y/n");
				String ans = SC.next();
				if (ans.equalsIgnoreCase("y")) {
					delStu();
				} else {
					MainPage.MianPage();
				}
			}
		}else{
			System.out.println("没有找到相关信息，请确认输入无误");
			System.out.println();
			System.out.println("是否继续删除？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				delStu();
			} else {
				MainPage.MianPage();
			}
		}
		}
	}

