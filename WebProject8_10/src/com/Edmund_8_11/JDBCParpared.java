package com.Edmund_8_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCParpared {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String user="root";
		String password = "root";
		PreparedStatement pstmt = null;
		Connection conn=null;
		ResultSet rs=null;
		
		try {	//1.ע������
			Class.forName(dirver);
			//2.ͨ��DriverManager�������
			conn=DriverManager.getConnection(url,user,password);
			//3.ͨ�����Ӵ���SQL������
			
			String sql = "insert into stu(name,sex,age,score) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//4.�����ʺŲ���
			pstmt.setString(1, "�ϴ�");
			pstmt.setString(2, "m");
			pstmt.setInt(3, 45);
			pstmt.setDouble(4, 98);
		
			//ִ�и���
			pstmt.executeUpdate();
			
			String sql2 ="select * from stu where id=?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, 6);
			rs=pstmt.executeQuery();
			
			
			
			//String sql="insert into stu values(6,'����,'m',24,48)";
		//	String sql="update stu set score=86 where name='����' ";
		//	String sql2="Select * from stu order by score desc";

			// rs=stmt.executeQuery(sql2);
		
			while(rs.next()){
			
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.println(rs.getDouble(5)+"\t");	
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
				//rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("关闭失败");
				e.printStackTrace();
			}
			
		}
		

	}

}
