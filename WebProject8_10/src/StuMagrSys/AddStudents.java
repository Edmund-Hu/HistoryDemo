package StuMagrSys;

import java.sql.SQLException;
import java.util.Scanner;

import com.Edmund_8_11.mj;

public class AddStudents {
	public static  void Addstu(){
		System.out.println("��ӭ����ѧ������ϵͳ");
		Scanner SC =new Scanner(System.in);
		Input input=new Input();
			System.out.println("������ѧ�����䣬����");
			input.input();
			int age =Input.ans;
			System.out.println("������ѧ������");
			String name =SC.next();	
			System.out.println("������ѧ���Ա�");
			String sex =String.valueOf(SC.next().charAt(0));	 
			System.out.println("������ѧ���ɼ�");
			input.Score();
			double score =Input.score;
			System.out.println("ȷ��Ҫ������y/n");
			String ans= SC.next();
			if(ans.equalsIgnoreCase("y")){
				mj.dConn();
				String sql =" insert into stu(name,sex,age,score) values(?,?,?,?)";
				try {
					mj.pstmt=mj.conn.prepareStatement(sql);
					mj.pstmt.setString(1, name);
					mj.pstmt.setString(2, sex);
					mj.pstmt.setInt(3, age);
					mj.pstmt.setDouble(4, score);
					mj.pstmt.executeUpdate();
					System.out.println("���ӳɹ���");
					
				} catch (SQLException e) {
					System.out.println("����ʧ��");
					e.printStackTrace();
				}
					
			}else{
				System.out.println("��������");
			}
			System.out.println("�������ӣ�y/n");
			String ans2= SC.next();
			if(ans2.equalsIgnoreCase("n")){
				MainPage.MianPage();
				
			}else{
				Addstu();
			}
		
		}
	
}