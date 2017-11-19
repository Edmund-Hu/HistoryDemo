package com.Edmund_8_11;

import java.sql.SQLException;

public class TestMyjB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mj.dConn();
		String sql =" insert into stu(name,sex,age,score) values('ÀÏ¶þ',?,?,?)";
		String sql2="delete from stu where id in('8','9','13','12')";
	
		try {
			String n = "ÄÐ";
			mj.pstmt= mj.conn.prepareStatement(sql);
			mj.pstmt.setString(1,n);
			mj.pstmt.setInt(2,23);
			mj.pstmt.setDouble(3, 87);
			mj.pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mj.close();
		
	}

}
