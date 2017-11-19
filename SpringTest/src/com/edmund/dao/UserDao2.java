package com.edmund.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edmund.entity.User;
@Repository("userdao2")
public class UserDao2 {
	@Resource
	private  User user2;
	
	@Resource
	private DataSource dataSource;
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	
	public List<User> getUser(String sql){
		List<User> list = new ArrayList<>();
		list = jdbcTemplate.query(sql, new UserRowMapper());
		System.out.println("userdao");
		return list;
	}
	
	public void insertUser(String sql){
		
		jdbcTemplate.execute(sql);
	}
}
