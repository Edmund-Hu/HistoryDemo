﻿package com.edmund.dao;


import org.springframework.stereotype.Repository;

import com.edmund.entity.User;
@Repository
public interface UserDao {
	public int addUser(User user);
	
	public int deleteUser(int id);

}
