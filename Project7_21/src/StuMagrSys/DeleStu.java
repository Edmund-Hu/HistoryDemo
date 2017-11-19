package StuMagrSys;

import java.util.Scanner;

public class DeleStu {
	public static void delStu(Students[] stu,int count){
		Scanner SC = new Scanner(System.in);
		int count2=count;
		boolean flag = false, found = false;
		do {System.out.println("所有学生信息为：");
		for (int i = 0; i < count2; i++) {
			System.out.println("姓名:" + stu[i].getName() + ",学号："
					+ stu[i].getID() + ", 性别：" + stu[i].getSex() + ",成绩："
					+ stu[i].getScore());
		}
		
			System.out.println("请输入需要删除的学生学号：");
			String SearchID = SC.next();
			for (int i = 0; i < count2; i++) {
				if (SearchID.equals(stu[i].getID())) {
					System.out.println("要删除的学生学号为" + SearchID + "，姓名为："
							+ stu[i].getName() + ", 性别为：" + stu[i].getSex()
							+ ",成绩为：" + stu[i].getScore());
					found = true;
					System.out.println("确认删除吗？y/n");
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
						System.out.println("删除成功！");	
					}
					
					break;
				} else {
					found = false;
				}
			}
			if (!found) {
				System.out.println("未找到学号为：" + SearchID + "的学生信息");
			}
			System.out.println("是否继续删除？y/n");
			String ans = SC.next();
			if (ans.equalsIgnoreCase("y")) {
				flag = true;
			} else {
				MainPage.MianPage();
			}
		} while (flag);
	}
}
