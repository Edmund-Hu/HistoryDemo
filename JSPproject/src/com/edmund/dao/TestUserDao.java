package com.edmund.dao;

import com.edmund.web.User;

public class TestUserDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setName("vhudp");
		u.setPassword("123");
		UserDao udao = new UserDao();
		User newusr = udao.checkUser(u);
		if(newusr == null){
			System.out.println("µÇÂ¼Ê§°Ü");
		}else{
			System.out.println("µÇÂ¼³É¹¦");
		}

	}

}
