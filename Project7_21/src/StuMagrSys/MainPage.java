package StuMagrSys;

import java.util.Scanner;

public class MainPage {

	static Students[] stu = new Students[50];
	static int count = 5;

	public static void MianPage() {
		System.out.println("\t"+"             登录成功，欢迎使用学生管理系统");
		System.out.println("\t" + "                              请选择1~5");
		System.out.print("1:添加学生" + "\t");
		System.out.print("2:修改学生" + "\t");
		System.out.print("3:删除学生" + "\t");
		System.out.print("4:查询学生" + "\t");
		System.out.println("5:退出系统");
		// System.out.println(stu.length);
		stu[0] = new Students();
		stu[0].setID("01");
		stu[0].setName("张三");
		stu[0].setScore(89);
		stu[0].setSex('男');
		stu[1] = new Students();
		stu[1].setID("02");
		stu[1].setName("李四");
		stu[1].setScore(90);
		stu[1].setSex('男');
		stu[2] = new Students();
		stu[2].setID("03");
		stu[2].setName("王五");
		stu[2].setScore(79);
		stu[2].setSex('男');
		stu[3] = new Students();
		stu[3].setID("04");
		stu[3].setName("赵六");
		stu[3].setScore(56);
		stu[3].setSex('女');
		stu[4] = new Students();
		stu[4].setID("05");
		stu[4].setName("张四");
		stu[4].setScore(95);
		stu[4].setSex('男');

		//Scanner SC = new Scanner(System.in);
		
		Input input=new Input();
		input.input();
		switch (Input.ans) {
		case 1:
			AddStudents.Addstu(stu);
			break;
		case 2:
			ModifStu.modstu(stu, count);

			break;
		case 3:
			DeleStu.delStu(stu, count);
			break;
		case 4:
			Search.menuSearch(stu, count);
			break;
		case 5:
			System.out.println("退出系统，谢谢使用");
			System.exit(0);

			break;
		default:
			break;
		}
	}
}
