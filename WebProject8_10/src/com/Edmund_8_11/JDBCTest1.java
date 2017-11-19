package com.Edmund_8_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
	
		String name ="ÕÅÈý";
		int age =23;
		char sex ='f';
		double score =99;
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");

		Statement statement=conn.createStatement();
	
		String sql = "insert into stu(name,sex,age,score) values("+"'"+name+"'"+","+"'"+sex+"'"+","+age+","+score+" )";
		String sql2 = "delete from stu where id=4 ";
		
		String sql4 = "select * from stu";
		//System.out.println(sql);
		//statement.executeUpdate(sql);
		ResultSet rs = statement.executeQuery(sql4);
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println(rsm.getTableName(2));
		while(rs.next()){
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getInt(4)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.println(rs.getDouble(5)+"\t");
			
		}
		
		
		//statement.executeQuery(sql3);
	
		rs.close();
		statement.close();
		conn.close();
		

	}

}
