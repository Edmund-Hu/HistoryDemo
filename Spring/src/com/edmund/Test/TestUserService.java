package com.edmund.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.User;
import com.edmund.service.UserService;
import com.edmund.service.imp.UserService2;

public class TestUserService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		UserService2 s = (UserService2)ctx.getBean("userServiceImp");
		s.addUser("ss");
	}

}
