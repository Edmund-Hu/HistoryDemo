package StuMagrSys;

import java.util.Scanner;

public class SearchId {
	public static void Srid(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		boolean flag = false, found = false;
		do {
			System.out.println("请输入需要查询的学生学号：");
			String SearchID = SC.next();
			for (int i = 0; i < count; i++) {
				if (SearchID.equals(stu[i].getID())) {
					System.out.println("学号为" + SearchID + "的学生姓名为："
							+ stu[i].getName() + ", 性别为：" + stu[i].getSex()
							+ ",成绩为：" + stu[i].getScore());
					found = true;
					break;
				} else {
					found = false;
				}
			}
			if (!found) {
				System.out.println("未找到学号为：" + SearchID + "的学生信息");
			}
			System.out.println("是否继续查询？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag = true;
			} else {
				Search.menuSearch(stu, count);
			}
		} while (flag);
	}
}
