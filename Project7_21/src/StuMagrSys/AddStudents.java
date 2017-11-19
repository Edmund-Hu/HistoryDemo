package StuMagrSys;

import java.util.Scanner;

public class AddStudents {
	public static  void Addstu(Students[] stu){
		System.out.println("欢迎进入学生添加系统");
		Scanner SC =new Scanner(System.in);
		for(int i=5;i<stu.length;){
			stu[i]=new Students();
			System.out.println("请输入学生学号");
			String ID =SC.next();	
			System.out.println("请输入学生姓名");
			String name =SC.next();	
			System.out.println("请输入学生性别");
			String s =SC.next();
			char sex=s.charAt(0);
			System.out.println("请输入学生成绩");
			Input input=new Input();
			input.Score();
			double score =Input.score;
			System.out.println("确认要添加吗？y/n");
			String ans= SC.next();
			if(ans.equalsIgnoreCase("y")){
				stu[i].setID(ID);
				stu[i].setName(name);
				stu[i].setSex(sex);
				stu[i].setScore(score);
				System.out.println("添加成功！");
				i++;
				MainPage.count++;
			}else{
				System.out.println("放弃添加");
			}
			System.out.println("继续添加？y/n");
			String ans2= SC.next();
			if(ans2.equalsIgnoreCase("n")){
				MainPage.MianPage();
				break;
			}else{
				continue;
			}
		
		}
	}
}
