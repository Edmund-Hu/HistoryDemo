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
		
		try {	//1.注册驱动
			Class.forName(dirver);
			//2.通过DriverManager获得连接
			conn=DriverManager.getConnection(url,user,password);
			//3.通过连接创建SQL语句对象
			
			String sql = "insert into stu(name,sex,age,score) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//4.设置问号参数
			pstmt.setString(1, "老大");
			pstmt.setString(2, "m");
			pstmt.setInt(3, 45);
			pstmt.setDouble(4, 98);
		
			//执行更新
			pstmt.executeUpdate();
			
			String sql2 ="select * from stu where id=?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, 6);
			rs=pstmt.executeQuery();
			
			
			
			//String sql="insert into stu values(6,'张三,'m',24,48)";
		//	String sql="update stu set score=86 where name='张三' ";
		//	String sql2="Select * from stu order by score desc";

			// rs=stmt.executeQuery(sql2);
		
			while(rs.next()){
			
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.println(rs.getDouble(5)+"\t");	
			}
			//System.out.println("鎻掑叆鎴愬姛");
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("创建连接失败");
			e.printStackTrace();
		}finally{
			try {
				//rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("鍏抽棴澶辫触");
				e.printStackTrace();
			}
			
		}
		

	}

}
