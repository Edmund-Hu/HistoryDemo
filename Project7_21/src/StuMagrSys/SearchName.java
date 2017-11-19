package StuMagrSys;

import java.util.Scanner;

public class SearchName {
	public static void srName(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		boolean flag1 = false, found1 = false;
		do {
			System.out.println("请输入需要查询的学生姓名：");
			String SearchName = SC.next();
			for (int i = 0; i < count; i++) {
				if (stu[i].getName().indexOf(SearchName)>=0) {
					System.out.println("姓名为" + stu[i].getName() + "的学生学号为："
							+ stu[i].getID() + ", 性别为：" + stu[i].getSex()
							+ ",成绩为：" + stu[i].getScore());
					found1 = true;
					//break;
				} else {
					//found1 = false;
				}
			}
			if (!found1) {
				System.out.println("未找到姓名为：" + SearchName + "的学生信息");
			}
			System.out.println("是否继续查询？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag1 = true;
			} else {
				Search.menuSearch(stu, count);
			}
		} while (flag1);
	}
}
