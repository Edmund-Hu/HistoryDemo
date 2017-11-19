package com.edmund.service;

import java.awt.print.Printable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.edmund.dao.UserDao2;
import com.edmund.entity.User;
@Service
public class UserService2 {
	
	private UserDao2 userDao;
	@Autowired
	public void setUserDao(@Qualifier("userdao2")UserDao2 userDao) {
		this.userDao = userDao;
	}

	public void UserDetails(){
		System.out.println("通过service2方法打印：");
	}
	public void inserUser(User user){
		String sql = "insert into user3(name,password) values('"+user.getName()+"','"+user.getPassword()+"')";
		userDao.insertUser(sql);
	}
	public void PrintUser(){
		String sql = "select * from user3";
		List<User> list = userDao.getUser(sql);
		for (User user : list) {
			System.out.println(user);
		}
	}
}
