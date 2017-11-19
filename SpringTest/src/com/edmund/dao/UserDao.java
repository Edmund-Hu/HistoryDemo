package com.edmund.dao;

import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edmund.entity.User;
@Repository("userDao")
public class UserDao {
	private  User user;
	
	public void setUser(User user) {
		this.user = user;
	}


	public User getUser(){
		System.out.println("进入userDao");
		return user;
	}
	
	
}
