package com.edmund.test;

import static org.junit.Assert.*;

import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.Depart;
import com.edmund.entity.User;
import com.edmund.mapper.DepartMapper;
import com.edmund.mapper.DepartMapper2;
import com.edmund.mapper.UserMapper;

import com.edmund.util.SqlSessionFactoryUtil;

public class JunitDepartTest {
	private static Logger log = Logger.getLogger(JunitDepartTest.class);
	SqlSession sqlSession = null;
	DepartMapper departMapper = null;
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		departMapper = sqlSession.getMapper(DepartMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	

	
	@Test
	public void findDepartWithUsers() {
		log.info("开始查找部门带用户！");
			Depart depart = departMapper.findDepartWithUsers(1);
			System.out.println(depart);
		
			log.info("完成查找学生信息！");
		
	}
	
	@Test
	public void findDepartWithUsers2() {
		log.info("注解开始查找部门带用户！");
		DepartMapper2 departMapper2 =sqlSession.getMapper(DepartMapper2.class);
			Depart depart = departMapper2.findDepartWithUsers(3);
			System.out.println(depart);
			log.info("完成查找学生信息！");
		
	}
	
	
}
