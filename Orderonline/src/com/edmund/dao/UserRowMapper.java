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
		user.setUserid(rs.getInt(1));
		user.setUsername(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setPhone(rs.getString(4));
		user.setAddress(rs.getString(5));
		user.setBalance(rs.getDouble(6));
		user.setPayword(rs.getString(7));
		return user;
	}
	
}
