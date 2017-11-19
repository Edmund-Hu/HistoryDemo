package com.edmund.mappers;

import java.util.List;

import com.edmund.entity.User;

public interface UserMapper {
	public int add(User user);
	public int update(User user);
	public int delete(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
	public User findByIdWithAddress(Integer id);
	public List<User> findByGradeId(Integer gradeId);
}
