package com.edmund.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.edmund.entity.User;

public class TestUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"/src/applicationContext.xml");
		//����ע��
		User user1 = (User) ctx.getBean("user");
		System.out.println(user1);
		//���췽��ע��
		User user3 =(User) ctx.getBean("user3");
		System.out.println(user3);
		//��������ע��
		User user4 =(User) ctx.getBean("user4");
		System.out.println(user4);
		//��̬��������ע��
				User user5 =(User) ctx.getBean("user5");
				System.out.println(user5);

		
	}
}
