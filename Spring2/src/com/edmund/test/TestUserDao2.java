package com.edmund.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.edmund.dao.UserDao2;

public class TestUserDao2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao2 uc2 = (UserDao2) act.getBean("userDao2");
		uc2.print();
		act.destroy();
	}
	
	
}
