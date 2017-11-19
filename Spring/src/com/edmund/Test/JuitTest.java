package com.edmund.Test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.edmund.entity.Students;

import com.edmund.service.imp.UserService2;
import com.edmund.service.imp.UserServiceImp;



public class JuitTest {
	ApplicationContext ctx = null;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
/*	@Test
	public void test() {
		User2 user2 = (User2) ctx.getBean("user2");
		System.out.println(user2);
	}*/
	@Test
	public void testStu(){
		Students students = (Students) ctx.getBean("student");
				System.out.println(students);
	}
	
	@Test
	public void testUserServiceImp(){
		UserService2 userimp = (UserService2) ctx.getBean("userServiceImp");
				userimp.addUser("����");
	}
	
	
}
