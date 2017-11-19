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

import com.edmund.entity.User;
import com.edmund.mappers.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class UserTest2 {
	private static Logger log = Logger.getLogger(UserTest2.class);
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
		log.info("开始查找所有用户");
		Map<String, Object> map = new HashMap<>();
		map.put("gradeId", 2);
		map.put("name", "%李%");
		//map.put("password", 123);
		List<User> list = userMapper.findByMap(map);
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void testFindAll2(){
		log.info("开始查找所有用户");
		Map<String, Object> map = new HashMap<>();
		//map.put("searchBy", "gradeId");
		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("password", 123);
		List<User> list = userMapper.findByMap2(map);
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void testFindAll3(){
		log.info("开始查找所有用户");
		Map<String, Object> map = new HashMap<>();
		//map.put("searchBy", "gradeId");
		//map.put("gradeId", 2);
		//map.put("name", "%李%");
		//map.put("addressId", 2);
		List<User> list = userMapper.findByMap3(map);
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testFindAll4(){
		log.info("开始查找所有用户foreach");
		Map<String, Object> map = new HashMap<>();
		List<Integer> gradeIds = new ArrayList<>();
		gradeIds.add(1);
		//gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		List<User> list = userMapper.findByMap4(map);
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void testUpdateUser(){
		log.info("开始更新用户");
		//Map<String, Object> map = new HashMap<>();
		User user = new User();
		user.setId(1);
		user.setName("张三2");
		user.setPassword("abc");
		int result= userMapper.updateUser(user);
		sqlSession.commit();
		if(result>0){
			log.info("修改学生成功！");
		}
		
	
	}
	@Test
	public void insertPic(){
		log.info("插入照片");
		User user = new User();
		user.setName("Edmund");
		user.setPassword("kkads");
		byte[] pic =null;
		File file = new File("D:/yan5.jpg");
		InputStream  in = null;
		try {
		 in = new FileInputStream(file);
		 pic = new byte[in.available()];
		 in.read(pic);
		 in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.setPic(pic);
		userMapper.insertUser(user);
		sqlSession.commit();
		
	}

	@Test
	public void getUsr() {
		log.info("查询有照片的学生");
		User user = userMapper.findById(30);
		byte[] pic = user.getPic();
		File file = new File("D:/yancopy.jpg");
		OutputStream out;
		try {
			out = new FileOutputStream(file);
			out.write(pic);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testfindByLimit(){
		log.info("分页查询");
		Map<String, Object> map = new HashMap<>();
		int start = 0;
		int size = 3;
		map.put("start", start);
		map.put("size", size);
		List<User> list = userMapper.findByLimit(map);
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	

}
