package com.edmund.controller;



import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;
@Controller("ucontrollor")
public class UserController {
	@Resource
	private User user;
	@Resource
	private UserDao udao;
/*	public UserDao getUdao() {
		return udao;
	}

	public void setUdao(UserDao udao) {
		this.udao = udao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	@PostConstruct
	public void adduser(){
		//udao.insertUser(user);
		System.out.println("≤Â»Î≥…π¶");
	}

	public void query(){
		String sql="select name,age,sex from user";
		List<User> list = udao.getUsers(sql);
		for(User u:list){
			System.out.println(u);
		}
		
	}
}
