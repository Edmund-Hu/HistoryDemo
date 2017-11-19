package StuMagrSys;

import java.util.Scanner;

public class SearchName {
	public static void srName() {
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入需要查询的学生姓名：支持模糊查询");
		String SearchName = SC.next();
		String sql="select * from stu where name like "+"'"+"%"+SearchName+"%"+"'";
		if(Show.Sheach(sql)){
			System.out.println("查询完毕，信息如下");
			Show.Showdetail(sql);
			System.out.println();
			System.out.println("是否继续查询？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				srName();
			} else {
				Search.menuSearch();
			}
			
		}
		else{
			System.out.println("没有找到相关信息，请确认输入无误");
			System.out.println();
			System.out.println("是否继续查询？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				srName();
			} else {
				Search.menuSearch();
			}
			
		}
	}
}
