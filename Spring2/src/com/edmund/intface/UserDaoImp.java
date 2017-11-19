package com.edmund.intface;

import java.util.List;

import com.edmund.entity.User;

public interface UserDaoImp {
	public void insertUser(User user);
	public User getuser(String sql);
	public List<User> getUsers(String sql);
	public boolean updateUser(String sql);
	
	
}
