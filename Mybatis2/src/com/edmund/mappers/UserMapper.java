package com.edmund.mappers;

import java.util.List;
import java.util.Map;

import com.edmund.entity.User;

public interface UserMapper {

	public List<User> findByMap(Map<String, Object> map);//if
	public List<User> findByMap2(Map<String, Object> map);//choose
	public List<User> findByMap3(Map<String, Object> map);//where 
	public List<User> findByMap4(Map<String, Object> map);//foreach
	public int updateUser(User user);//set
	public int insertUser(User user);
	public User findById(Integer id);
	public List<User> findByLimit(Map<String, Object> map);//分页
}
