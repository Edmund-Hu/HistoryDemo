package com.edmund.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.User;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class UserTest3 {
	private static Logger log = Logger.getLogger(UserTest.class);
	SqlSession sqlSession = null;
	UserMapper userMapper = null;
	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
	}
	/**
	 * 测试方法后调用
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}


	@Test
	public void testFindAll(){
		log.info("开始查找用户(带地址)");
		User user= userMapper.findByIdWithAddress(1);
		System.out.println(user);
	}
	
	

}
