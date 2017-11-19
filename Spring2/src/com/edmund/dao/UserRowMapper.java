package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edmund.entity.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(rs.getString(1));
		user.setAge(rs.getInt(2));
		user.setSex(rs.getString(3));
		
		return user;
	}
	
}
