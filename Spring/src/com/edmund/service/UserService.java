package com.edmund.service;

import com.edmund.Dao.UserDao;
import com.edmund.entity.User;

public class UserService {
	public UserDao udao;
	public UserService(){
		System.out.println("进入UserService");
	}
	public UserDao getUdao() {
		return udao;
	}
	public void setUdao(UserDao udao) {
		this.udao = udao;
	}
	public void adduser(User user){
		udao.add(user);
	}
	public static void main(String[] args) {
		UserService us = new UserService();
		User uer = new User();
		uer.setName("ss");
		uer.setPassword("123");
		us.adduser(uer);
	}
}
