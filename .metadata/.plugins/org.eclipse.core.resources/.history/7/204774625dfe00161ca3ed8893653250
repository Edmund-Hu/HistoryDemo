package com.edmund.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;
@Service
@Transactional
public class UserService {
	@Resource
	private UserDao userDao;
	
	public int insertUser(User user){
		System.out.println("调用UserService方法");
		return userDao.insertUser(user);
	}
	
	public void updateUser(User user){
		userDao.insertUser(user);
		userDao.deleteUser(3);
	}
}
