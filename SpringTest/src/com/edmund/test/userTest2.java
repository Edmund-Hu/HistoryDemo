package com.edmund.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.User;
import com.edmund.service.UserService2;

public class userTest2 {
 public static void main(String[] args) {
	 ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
	 /*User user = (User) ctx.getBean("user4");*/
	 UserService2 userService = (UserService2) ctx.getBean("userService2");
	 userService.UserDetails();
 }
}
