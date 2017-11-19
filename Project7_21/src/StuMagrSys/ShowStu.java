package StuMagrSys;

import java.util.Scanner;

public class ShowStu {

	public static void show(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		System.out.println("所有学生信息为：");
		for (int i = 0; i < count; i++) {
			System.out.println("姓名:" + stu[i].getName() + ",学号："
					+ stu[i].getID() + ", 性别：" + stu[i].getSex() + ",成绩："
					+ stu[i].getScore());
		}
		System.out.println("是否继续返回上一级？y/n");

		String ans = SC.next();
		if (ans.equalsIgnoreCase("y")) {
			Search.menuSearch(stu, count);
		}else{
			ShowStu.show(stu, count);
		}
	}
}
