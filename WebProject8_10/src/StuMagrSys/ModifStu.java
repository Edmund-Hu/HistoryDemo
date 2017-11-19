package StuMagrSys;

import java.sql.SQLException;
import java.util.Scanner;

import com.Edmund_8_11.mj;
import com.sun.crypto.provider.RSACipher;


public class ModifStu {
	public static void modstu() {
		System.out.println("所有学生信息为：");
		Show.Showdetail();
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入需要修改的学生学号：");
		String SearchID = SC.next();
		String sql="select * from stu where id="+SearchID;
		if(Show.Sheach(sql)){
		
			mj.dConn();
			try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
				int age=0;
				String name=null;
				String sex=null;
				double score=0;
				while(mj.rs.next()){
				Input input=new Input();
				System.out.println("请输入修改后的年龄，整型(输入'0'表示不修改)，原来年龄为："+mj.rs.getInt(4));
				input.input();
				age =Input.ans==0?mj.rs.getInt(4):Input.ans;
				System.out.println("请输入学生姓名,原来的姓名为："+mj.rs.getString(2)+"'_'表示不修改");
					String ans=SC.next();
				 name= ans.equals("_")?mj.rs.getString(2):ans;	
				System.out.println("请输入学生性别  "+"'_'表示不修改");
				String ans2 =String.valueOf(SC.next().charAt(0));
		 	 sex= ans2.equals("_")?mj.rs.getString(3):ans2;
				System.out.println("请输入学生成绩"+"'-1'表示不修改");
				input.Score();
				score =Input.score==-1?mj.rs.getDouble(5):Input.score;
				}
				System.out.println("确认要修改吗？y/n");
				String ans3= SC.next();
				if(ans3.equalsIgnoreCase("y")){
					String sql1 = "update stu set name="+"'"+name+"'"+" where id="+SearchID;
					String sql2 = "update stu set age="+"'"+age+"'"+" where id="+SearchID;
					String sql3 = "update stu set sex="+"'"+sex+"'"+" where id="+SearchID;
					String sql4 = "update stu set score="+"'"+score+"'"+" where id="+SearchID;
					
						Modify.modify(sql1);
						Modify.modify(sql2);
						Modify.modify(sql3);
						Modify.modify(sql4);
						System.out.println("修改成功！");
						System.out.println("是否继续修改？y/n");
						String ans4 = SC.next();
						if (ans4.equalsIgnoreCase("y")) {
							modstu();
						} else {
							MainPage.MianPage();
						}
					
				}else{
					System.out.println("用户放弃修改");
					System.out.println("是否继续修改？y/n");
					String ans4 = SC.next();
					if (ans4.equalsIgnoreCase("y")) {
						modstu();
					} else {
						MainPage.MianPage();
					}
				}
				
			/*	while(mj.rs.next()){
					System.out.print(mj.rs.getInt(1)+"\t");
					System.out.print(mj.rs.getString(2)+"\t");
					System.out.print(mj.rs.getString(3)+"\t");
					System.out.print(mj.rs.getInt(4)+"\t");
					System.out.println(mj.rs.getDouble(5)+"\t");
				}*/
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
			}finally{
				mj.close();
			}
			
			
		}else{
			System.out.println("没有找到相关信息，请确认输入无误");
		System.out.println();
		System.out.println("是否继续修改？y/n");
		String ans = SC.next();
		if (ans.equalsIgnoreCase("y")) {
			modstu();
		} else {
			MainPage.MianPage();
		}
			
		}
				
		}
		

	
}
