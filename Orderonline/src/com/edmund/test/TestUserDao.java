package com.edmund.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sun.net.www.content.image.gif;

import com.edmund.dao.GoodDao;
import com.edmund.dao.UserDao;
import com.edmund.entity.Good;
import com.edmund.entity.User;



public class TestUserDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext act = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserDao uc2 = (UserDao) act.getBean("userDao");
	
		String sql =" select * from user where username = 'vhudp'";

		User user = uc2.getuser(sql);
		System.out.println(user);
	
	}

}
