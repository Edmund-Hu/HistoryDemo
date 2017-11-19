package com.Edmund_8_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/student";
		String user="root";
		String password = "root";
		Statement stmt=null;
		Connection conn=null;
		ResultSet rs=null;
		try {	//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.ͨ��DriverManager�������
			conn=DriverManager.getConnection(url,user,password);
			//3.ͨ�����Ӵ���SQL������
			stmt=conn.createStatement();
			//String sql="insert into stu values(6,'����,'m',24,48)";
			String sql="update stu set score=86 where name='����' ";
			String sql2="Select * from stu order by score desc";
			stmt.executeUpdate(sql);
			 rs=stmt.executeQuery(sql2);
			 Scanner sc = new Scanner(System.in);
			 System.out.println("��������Ҫ��ѯ������");
			 String name= sc.next();
			while(rs.next()){
				String str =  rs.getString(2);
				//System.out.println(name);
				//System.out.println(str);
				//System.out.println(name.equals(str));
				if(name.equals(str)){
					System.out.println("��"+name+"�������Ϣ�����ĳɼ���"+rs.getDouble(5));
				}else{
					//System.out.println("没有此人的信息！");
				}
				//System.out.print(rs.getInt(1)+"\t");
			//System.out.print(rs.getString(2)+"\t");
				//System.out.print(rs.getString(3)+"\t");
				//System.out.print(rs.getInt(4)+"\t");
				//System.out.println(rs.getDouble(5)+"\t");	
			}
			//System.out.println("插入成功");
		} catch (ClassNotFoundException e) {
			System.out.println("ע������ʧ��");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("关闭失败");
				e.printStackTrace();
			}
			
		}
		

	}

}
