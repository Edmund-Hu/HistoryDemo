package com.edmund.mapper;

import java.util.List;
import java.util.Map;

import com.edmund.entity.User;

public interface UserMapper{
	public User findUserById(int id);
	public int  addUser(User user);
	public int  updateUser(User user);
	public int  deleteUser(int id);
	public List<User> findAllUser();
	public User findUserWithDepart(int id);
	public List<User> findUserByDepartId(int departid);
	//动态查询
	public List<User> DynamicSelect(Map<String, Object> map);
	//动态查询
	public List<User> DynamicSelect2(Map<String, Object> map);
	 public int DynamicInsert(Map<String, Object> map);
	 
	 public int DynamicUpdate(Map<String, Object> map);
		
}
