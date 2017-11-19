package com.edmund.test;

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
import com.edmund.mapper.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class JunitUserTest {
	private static Logger log = Logger.getLogger(JunitUserTest.class);
	private static SqlSession sqlSession=null;
	private static UserMapper userMapper =null;
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	

	@Test
	public void test() {
		log.info("开始查找学生！");
		User user = userMapper.findUserById(1);
	//	User user3 = new User(157,"HJHA",26);
		//userMapper.updateUser(user);
	//	sqlSession.commit();
	//	User user2 = userMapper.findUserById(3);
		System.out.println(user);
	//	System.out.println(user==user2);
		//System.out.println(user2);
		log.info("完成打印学生信息！");
	}
	
	@Test
	public void test2() {
		log.info("开始查找学生！");
		User user = userMapper.findUserById(3);
		System.out.println(user);
		log.info("完成打印学生信息！");
	}
	
	@Test
	public void testFindAllUsers() {
		log.info("开始查找学生！");
		List<User> users = userMapper.findAllUser();
		for (User user : users) {
			System.out.println(user);
		}
		log.info("完成打印学生信息！");
	}
	
	@Test
	public void testInsert() {
		log.info("开始添加学生！");
		User user = new User();
		user.setName("Frank");
		user.setAge(24);
		int result = userMapper.addUser(user);
		sqlSession.commit();
		System.out.println(result);
		log.info("完成添加学生信息！");
	}

	@Test
	public void testUpdate() {
		log.info("开始更新学生！");
		User user = new User(2,"Alex",30);
			userMapper.updateUser(user);
			sqlSession.commit();
		log.info("完成更新学生信息！");
	}
	
	@Test
	public void testDelete() {
		log.info("开始删除学生！");
			int result = userMapper.deleteUser(4);
			sqlSession.commit();
		if(result == 1){
			log.info("完成删除学生信息！");
		}
	}
	
	@Test
	public void findUserWithDepart() {
		log.info("开始查找学生带部门！");
			User user = userMapper.findUserWithDepart(3);
		System.out.println(user.getName()+"的部门信息是"+user.getDepart());
		
			log.info("完成查找学生信息！");
		
	}
	

	@Test
	public void findUserByDepartId() {
		log.info("开始查找学生带部门！");
			List<User> users = userMapper.findUserByDepartId(1);
	for (User user : users) {
		System.out.println(user);
	}
		
			log.info("完成查找学生信息！");
		
	}
	@Test
	public void 打印(){
		
		int a = -6;
				for(int i = 0 ;i<32;i++){
					int t = (a & 0x80000000>>>i)>>>(31-i);
					System.out.print(t);
				}
		
	}
	
	@Test
	public void testDynamicSelect(){
		Map<String, Object> map = new HashMap<>();
		//map.put("id", 3);
		map.put("name", "%n%");
		List<User> users = userMapper.DynamicSelect(map);
		for (User user : users) {
			System.out.println(user);
		}
	
	}
	@Test
	public void testDynamicSelect2(){
		Map<String, Object> map = new HashMap<>();
		List<Integer> idList = new ArrayList<>();
		idList.add(1);
		idList.add(3);
		//idList.add(2);
		map.put("idList", idList);
		//map.put("name", "%M%");
		List<User> users = userMapper.DynamicSelect2(map);
		for (User user : users) {
			System.out.println(user);
		}
	
	}
	
	@Test
	public void testDynamicInsert(){
		Map<String, Object> map = new HashMap<>();
		List<User> userList = new ArrayList<>();
		userList.add(new User("aaa",30));
		userList.add(new User("bbb",20));
		userList.add(new User("ccc",25)); 
		map.put("userList", userList);
		//map.put("name", "%M%");
	int result = userMapper.DynamicInsert(map);
	sqlSession.commit();
	
	}
	@Test
	public void testDynamicUpdate(){
		Map<String, Object> map = new HashMap<>();
		map.put("id", 7);
		map.put("name", "AAA");
/*	User user = new User();
	user.setId(157);
	user.setName("aaa");*/
	int result = userMapper.DynamicUpdate(map);
	sqlSession.commit();
	}
}
