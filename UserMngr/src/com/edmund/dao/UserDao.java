package com.edmund.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.edmund.tool.DataBaseUtil;
import com.edmund.web.User;
import com.sun.org.apache.regexp.internal.recompile;


public class UserDao {
	public User checkUser(User user){
		String userName = user.getName();
		String password = user.getPassword();
		 Connection conn = null;
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 User u = null;
		 String sql = "select username,password from userinfo where username=? and password=? ";
		try {
			 conn = DataBaseUtil.getConnection();
			pst = conn.prepareStatement(sql);
			//?¸³Öµ
			pst.setString(1, userName);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
		
			if(rs.next()){
			u = new User();
			String name =rs.getString(1);
			String pw  = rs.getString(2);
			u.setName(name);
			u.setPassword(pw);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DataBaseUtil.close(conn, pst, rs);
		}
		
		return u;
	}
}
