package com.edmund.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.edmund.entity.User;
import com.edmund.entity.User2;

@Service
public class UserDao2 {
	@Resource
	private User user;
	@Autowired
	public User2 user2;

	public User getUser() {
		return user;
	}
	/*@Autowired*/
	public void setUser(User user) {
		this.user = user;
	}

	public void print(){
		System.out.println(user.getName());
		System.out.println(user2.getName());
	}
	@PostConstruct
	public void init1(){
		System.out.println("调用初始化方法");
	}
	@PreDestroy
	public void destroy1(){
		System.out.println("调用销毁方法");
	}
	
}
