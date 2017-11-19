package com.edmund.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.Controller.UserController;

public class TestUserControll {
public static void main(String[] args) {
	ApplicationContext atc= new ClassPathXmlApplicationContext("applicationContext.xml");
	UserController uc =(UserController) atc.getBean("userController");
	uc.qukuan();
	uc.earnMoney();
	
}
}
