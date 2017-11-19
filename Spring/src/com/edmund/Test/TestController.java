package com.edmund.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.Controller.Controller;
import com.edmund.entity.User;


public class TestController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		 Controller ctl = (Controller) ctx.getBean("controller");
		 User uer = new User();
			uer.setName("ss");
			uer.setPassword("123");
			ctl.adduser(uer);
	}

}
