package StuMagrSys;

import java.util.Scanner;

public class SortStu {
	public static void sort() {
		Scanner SC = new Scanner(System.in);
		System.out.println("学生成绩排序由大到小如下：");
		String sql="select * from stu order by score desc";
		Show.Showdetail(sql);
		System.out.println("查询完毕");
		System.out.println("是否继续返回上一级？y/n");
		String ans ;
		ans = SC.next();
	
		if (ans.equalsIgnoreCase("y")) {
			Search.menuSearch();
		}else{
			System.out.println("请参考上结果");
			Search.menuSearch();
		}

	}
}
