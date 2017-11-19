package com.edmund.factory;

import com.edmund.entity.User;

public class UserFactory {
	public User createUser(){
		User user = new User();
		user.setName("张三");
		user.setPassword("444");
		return user;
	}
}
