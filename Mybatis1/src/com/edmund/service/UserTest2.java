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

public class UserTest2 {
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


	public void testAdd() {
		log.info("开始添加用户");
		User user = new User("王五","123");
		int result = userMapper.add(user);
		sqlSession.commit();
		if(result>0){
			log.info("添加成功！");
			}
		}
	
	public void testUpdate(){
		log.info("开始修改用户");
		User user = new User(21,"王五2","123");
		int result= userMapper.update(user);
		sqlSession.commit();
		if(result>0){
			log.info("修改成功！");
			}
		}
	
	public void testDelete(){
		log.info("开始删除用户");
		int result= userMapper.delete(20);
		sqlSession.commit();
		if(result>0){
			log.info("删除成功！");
			}
		}
	

	public void testfindById(){
		log.info("开始查找单个用户");
		User user = userMapper.findById(28);
		sqlSession.commit();
		System.out.println(user);
		}
	@Test
	public void testFindAll(){
		log.info("开始查找所有用户");
		List<User> list = userMapper.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	

}
