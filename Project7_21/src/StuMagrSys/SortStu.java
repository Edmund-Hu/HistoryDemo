package StuMagrSys;

import java.util.Scanner;

public class SortStu {
	public static void sort(Students[] stu, int count) {
		Scanner SC = new Scanner(System.in);
		System.out.println("学生成绩排序由大到小如下：");
		// boolean flag4;
		for (int i = 1; i < count; i++) {
			// flag4=true;
			for (int j = 0; j < count - i; j++) {
				if (stu[j].getScore() < stu[j + 1].getScore()) {
					double score = stu[j].getScore();
					stu[j].setScore(stu[j + 1].getScore());
					stu[j + 1].setScore(score);

					String name = stu[j].getName();
					stu[j].setName(stu[j + 1].getName());
					stu[j + 1].setName(name);

					char sex = stu[j].getSex();
					stu[j].setSex(stu[j + 1].getSex());
					stu[j + 1].setSex(sex);

					String ID = stu[j].getID();
					stu[j].setID(stu[j + 1].getID());
					stu[j + 1].setID(ID);
					// flag4=false;

				}
				// if(flag4){
				// break;
				// }
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println("姓名:" + stu[i].getName() + ",学号："
					+ stu[i].getID() + ", 性别：" + stu[i].getSex() + ",成绩："
					+ stu[i].getScore());
		}

		System.out.println("是否继续返回上一级？y/n");
		String ans4 ;
		ans4 = SC.next();
	
		if (ans4.equalsIgnoreCase("y")) {
			Search.menuSearch(stu, count);
		}else{
			SortStu.sort(stu, count);
		}

	}
}
