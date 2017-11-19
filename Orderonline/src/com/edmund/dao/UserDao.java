package com.edmund.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.edmund.entity.User;



@Repository("userDao")
public class UserDao {
	@Resource
	public DataSource dataSource;
	public User getuser1(String sql){
		System.out.println("进来0");
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			System.out.println("进来1");
			conn =dataSource.getConnection();
			pstmt =conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("进来2");
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
		
	}


	
	@Resource
	public JdbcTemplate jdbcTemplate;
	
	
	public boolean updateUser(String sql) {
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("更新失败");
			return false;
		}
	}

	public User getuser(String sql,String username) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> list =jdbcTemplate.query(sql, new Object[]{username},new int[]{java.sql.Types.VARCHAR},new UserRowMapper());
		//如果用户名不存在，list将为空，直接返回Null,否则会出错！
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public User getuser(String sql) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> list =jdbcTemplate.query(sql,new UserRowMapper());
		//如果用户名不存在，list将为空，直接返回Null,否则会出错！
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public List<User> getUsers(String sql) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new UserRowMapper());
	}
	
	public boolean insertUser(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("更新失败");
			return false;
		} 	
	}

}
