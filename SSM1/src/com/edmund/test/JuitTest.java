package com.edmund.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




import com.edmund.service.UserService;
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
	public void testUserServiceImp(){
		
	}

				
	
	
}
