package StuMagrSys;

import java.util.Scanner;

public class ModifStu {
	public static void modstu(Students[] stu, int count) {
		System.out.println("所有学生信息为：");
		for (int i = 0; i < count; i++) {
			System.out.println("姓名:" + stu[i].getName() + ",学号："
					+ stu[i].getID() + ", 性别：" + stu[i].getSex() + ",成绩："
					+ stu[i].getScore());
		}
		Scanner SC = new Scanner(System.in);
		boolean found = false;
		System.out.println("请输入需要修改的学生学号：");
		String SearchID = SC.next();
		for (int i = 0; i < count; i++) {
			if (SearchID.equals(stu[i].getID())) {
				System.out.println("学号为" + SearchID + "的学生姓名为："
						+ stu[i].getName() + ", 性别为：" + stu[i].getSex()
						+ ",成绩为：" + stu[i].getScore());
				found = true;
				System.out.println("请输入学生新的姓名：原姓名为" + stu[i].getName());
				String name = SC.next();
				System.out.println("请输入学生新的分数：原分数为" + stu[i].getScore());
				Input input=new Input();
				input.Score();
				double score =Input.score;
				System.out.println("确认修改？y/n");
				String ans = SC.next();
				if (ans.equalsIgnoreCase("y")) {
					stu[i].setName(name);
					stu[i].setScore(score);
					System.out.println("修改成功！是否继续修改？y/n");
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
			System.out.println("未找到学号为：" + SearchID + "的学生信息,请重新输入");
			ModifStu.modstu(stu, count);
		}

	}
}
