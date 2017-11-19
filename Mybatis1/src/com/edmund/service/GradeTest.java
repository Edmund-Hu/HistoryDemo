package com.edmund.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.edmund.entity.Grade;
import com.edmund.entity.User;
import com.edmund.mappers.GradeMapper;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class GradeTest {
	private static Logger log = Logger.getLogger(UserTest.class);
	SqlSession sqlSession = null;
	GradeMapper gradeMapper = null;
	/**
	 * ���Է���ǰ����
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		gradeMapper = (GradeMapper) sqlSession.getMapper(GradeMapper.class);
	}
	/**
	 * ���Է��������
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}


	@Test
	public void testFindById(){
		log.info("��ʼ�����꼶(��ѧ��)");
		Grade grade = gradeMapper.findById(2);
		System.out.println(grade.getUsers());
		
	}
	
	

}
