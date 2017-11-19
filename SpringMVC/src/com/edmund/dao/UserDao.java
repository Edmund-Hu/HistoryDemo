package com.edmund.dao;


import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


import com.edmund.tool.mj;
import com.edmund.entity.*;

@Repository
public class UserDao{
	 public static User getUser(String username){
			mj.dConn();
			try {
				String sql="select id,username,password from userinfo where username=? ";
				
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.pstmt.setString(1, username);
				mj.rs=mj.pstmt.executeQuery();
				User user =new User();
				while(mj.rs.next()){
					user.setId(mj.rs.getInt(1));
					user.setUsername(mj.rs.getString(2));
					user.setPassword(mj.rs.getString(3));
				}
				return user;
			} catch (SQLException e) {
				System.out.println("œ‘ æœÍ«È ß∞‹");
				e.printStackTrace();
				return null;
			}finally{
				mj.close();
			}

		}
	 
	 public static User[] getUsers(){
			mj.dConn();
			String sql="select * from userinfo limit 0,10";
			List<Map<String,Object>> list=mj.executeQuery(sql);
				User[] user =new User[list.size()];
				for(int i=0;i<list.size();i++){
					user[i] = new User();
					user[i].setId((Integer)(list.get(i).get("id")));
					user[i].setUsername((String)(list.get(i).get("username")));
					user[i].setPassword((String)(list.get(i).get("password")));
				}
				return user;
			
		}
	
}
