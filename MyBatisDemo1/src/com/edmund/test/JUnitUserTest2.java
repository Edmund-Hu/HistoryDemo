package com.edmund.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.User;
import com.edmund.mapper.UserMapper2;
import com.edmund.util.SqlSessionFactoryUtil;

public class JUnitUserTest2 {
	private static Logger log = Logger.getLogger(JunitUserTest.class);
	private static SqlSession sqlSession=null;
	private static UserMapper2 userMapper =null;
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		userMapper = sqlSession.getMapper(UserMapper2.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	
	@Test
	public void testSelect() {
		log.info("使用注解查询用户！");
		User user= userMapper.findUserById(2);
		System.out.println(user);
	}
	
	@Test
	public void testInsert() {
		log.info("使用注解添加用户！");
		User user= new User(21,"user22", 2);
		int result = userMapper.insertUser(user);
		sqlSession.commit();
		
	}
	@Test
	public void testUpdate() {
		log.info("使用注解更改用户！");
		User user= new User(24,"user", 2);
		user.setId(185);
		int result = userMapper.updateUser(user);
		sqlSession.commit();
		
	}
	
	@Test
	public void testDelete() {
		log.info("使用注解删除用户！");
		int result = userMapper.deleteUser(180);
		sqlSession.commit(); 
		
	}
	
	@Test
	public void testFindAllUser() {
		log.info("使用注解查找所有用户！");
		List<User> users= userMapper.findAllUser();
	for (User user : users) {
		System.out.println(user);
	}
		
	}
	@Test
	public void testfindUsersWithDepart(){
		log.info("使用注解查找所有用户带部门！");
		List<User> users= userMapper.findUsersWithDepart();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testDynamicSelect(){
		log.info("使用注解动态查找用户");
		Map<String,Object> map = new HashMap<>();
		map.put("id", 2);
		map.put("name", "%M%");
		List<User> users= userMapper.selectDynamic(map);
		for (User user : users) {
			System.out.println(user);
		}
	}
}
