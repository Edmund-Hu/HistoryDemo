package com.edmund.factory;

import com.edmund.entity.User;

public class UserFactory2 {
	public static User createUser(){
		User user = new User();
		user.setName("张三2");
		user.setPassword("555");
		return user;
	}
}
