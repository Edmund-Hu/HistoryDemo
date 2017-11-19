package com.edmund.service;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.Depart;
import com.edmund.entity.Student;
import com.edmund.entity.User;
import com.edmund.mappers.DepartMapper;
import com.edmund.mappers.StudentMapper;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class DepartTest {
	private static Logger log = Logger.getLogger(DepartTest.class);
	SqlSession sqlSession = null;
	DepartMapper departMapper = null;
	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		departMapper = (DepartMapper) sqlSession.getMapper(DepartMapper.class);
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
		public void selectAllStuWith() {
			log.info("使用注解查找学生带部门");
			Depart depart =  departMapper.findDepartByIdWithStu(2);
			System.out.println(depart);
			
			
		}


}
