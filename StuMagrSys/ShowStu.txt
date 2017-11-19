package StuMagrSys;

import java.util.Scanner;

public class ShowStu {

	public static void show() {
		Scanner SC = new Scanner(System.in);
		System.out.println("所有学生信息为：");
		Show.Showdetail();
		System.out.println("是否继续返回上一级？y/n");
		String ans = SC.next();
		if (ans.equalsIgnoreCase("y")) {
			Search.menuSearch();
		}else{
			ShowStu.show();
		}
	}
}
