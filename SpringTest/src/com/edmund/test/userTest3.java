package com.edmund.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.User;
import com.edmund.service.UserService2;
import com.edmund.service.UserServiceInt;

public class userTest3 {
 public static void main(String[] args) {
	 ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
	 UserServiceInt userService = (UserServiceInt) ctx.getBean("userServiceImp");
	 userService.Test();;
 }
}
