package com.edmund.service;

import org.apache.log4j.Logger;

import com.edmund.entity.User;


public interface UserService {
	public static Logger log = Logger.getLogger(UserService.class);
	public int addUser(User user);
}
