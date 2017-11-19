package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edmund.entity.User;






public class UserRowMapper implements RowMapper<User> {


	@Override
	public User mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		
		User user = new User() ;
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setPassword(rs.getString(3));
		return user;
	}

}
