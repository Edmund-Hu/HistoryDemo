package StuMagrSys;

import java.util.Scanner;

public class Search {
	public static void menuSearch() {
		System.out.println("\t" + "       请选择查询方式：输入1~5");
		System.out.print("1:根据学号查询" + "\t");
		System.out.print("2:根据姓名查询" + "\t");
		System.out.print("3:查询所有学生" + "\t");
		System.out.print("4:成绩排行榜" + "\t");
		System.out.println("5:返回上一级" + "\t");
		Input input=new Input();
		input.input();
		switch (Input.ans) {
		case 1:
			SearchId.Srid();
			break;
		case 2:
			SearchName.srName();
			break;
		case 3:
			ShowStu.show();
			break;
		case 4:
			SortStu.sort();
			break;
		case 5:
			MainPage.MianPage();
			break;
		}
	}
}
