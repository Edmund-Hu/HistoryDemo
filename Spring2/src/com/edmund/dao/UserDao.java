package com.edmund.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edmund.entity.User;
import com.edmund.intface.UserDaoImp;

@Repository
public class UserDao implements UserDaoImp {
	@Resource
	public DataSource dataSource;
	@Resource
	public JdbcTemplate jdbcTemplate;
	

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		String name = user.getName();
		int age = user.getAge();
		String sex = user.getSex();

			//获得连接
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			String sql ="insert into user(name,age,sex)values(?,?,?)";
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, sex);
			System.out.println("1");
			pstmt.executeUpdate();
			System.out.println("条用insert");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}



	@Override
	public boolean updateUser(String sql) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public User getuser(String sql) {
		// TODO Auto-generated method stub
		return (User) jdbcTemplate.query(sql, new UserRowMapper());
	}

	@Override
	public List<User> getUsers(String sql) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new UserRowMapper());
	}

}
