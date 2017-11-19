package com.edmund.service;


import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.edmund.entity.User;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class UserTest {
	private static Logger log = Logger.getLogger(UserTest.class);
	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		User user = new User("张三","123");
		int result = userMapper.add(user);
		sqlSession.commit();
		if(result>0){
			log.info("用户添加成功！");
			}
		}
	}
	

