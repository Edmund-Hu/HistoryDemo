package StuMagrSys;
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

		Input input=new Input();
		input.input();
		switch (Input.ans) {
		case 1:
			AddStudents.Addstu();
			break;
		case 2:
			ModifStu.modstu();

			break;
		case 3:
			DeleStu.delStu();
			break;
		case 4:
			Search.menuSearch();
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
