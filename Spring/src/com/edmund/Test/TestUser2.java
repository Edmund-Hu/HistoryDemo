package com.edmund.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.User2;

public class TestUser2 {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	User2 u2 = (User2) ctx.getBean("user2");
	System.out.println(u2);
}
}
