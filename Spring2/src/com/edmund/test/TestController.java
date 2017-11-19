package com.edmund.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.controller.UserController;

public class TestController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController uc = (UserController) actx.getBean("ucontrollor");
		//uc.adduser();

		uc.query();
	}

}
