package StuMagrSys;

import java.util.Scanner;

public class MainPage {

	static Students[] stu = new Students[50];
	static int count = 5;

	public static void MianPage() {
		System.out.println("\t"+"             ��¼�ɹ�����ӭʹ��ѧ������ϵͳ");
		System.out.println("\t" + "                              ��ѡ��1~5");
		System.out.print("1:���ѧ��" + "\t");
		System.out.print("2:�޸�ѧ��" + "\t");
		System.out.print("3:ɾ��ѧ��" + "\t");
		System.out.print("4:��ѯѧ��" + "\t");
		System.out.println("5:�˳�ϵͳ");
		// System.out.println(stu.length);
		stu[0] = new Students();
		stu[0].setID("01");
		stu[0].setName("����");
		stu[0].setScore(89);
		stu[0].setSex('��');
		stu[1] = new Students();
		stu[1].setID("02");
		stu[1].setName("����");
		stu[1].setScore(90);
		stu[1].setSex('��');
		stu[2] = new Students();
		stu[2].setID("03");
		stu[2].setName("����");
		stu[2].setScore(79);
		stu[2].setSex('��');
		stu[3] = new Students();
		stu[3].setID("04");
		stu[3].setName("����");
		stu[3].setScore(56);
		stu[3].setSex('Ů');
		stu[4] = new Students();
		stu[4].setID("05");
		stu[4].setName("����");
		stu[4].setScore(95);
		stu[4].setSex('��');

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
			System.out.println("�˳�ϵͳ��ллʹ��");
			System.exit(0);

			break;
		default:
			break;
		}
	}
}
