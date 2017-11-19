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
	 * ���Է���ǰ����
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
	}
	/**
	 * ���Է��������
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}


	public void testAdd() {
		log.info("��ʼ����û�");
		User user = new User("����","123");
		int result = userMapper.add(user);
		sqlSession.commit();
		if(result>0){
			log.info("��ӳɹ���");
			}
		}
	
	public void testUpdate(){
		log.info("��ʼ�޸��û�");
		User user = new User(21,"����2","123");
		int result= userMapper.update(user);
		sqlSession.commit();
		if(result>0){
			log.info("�޸ĳɹ���");
			}
		}
	
	public void testDelete(){
		log.info("��ʼɾ���û�");
		int result= userMapper.delete(20);
		sqlSession.commit();
		if(result>0){
			log.info("ɾ���ɹ���");
			}
		}
	

	public void testfindById(){
		log.info("��ʼ���ҵ����û�");
		User user = userMapper.findById(28);
		sqlSession.commit();
		System.out.println(user);
		}
	@Test
	public void testFindAll(){
		log.info("��ʼ���������û�");
		List<User> list = userMapper.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	

}
