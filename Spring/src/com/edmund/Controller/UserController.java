package com.edmund.Controller;

import com.edmund.Dao.UserDao;
import com.edmund.entity.User;
import com.edmund.service.UserService;

public class UserController {
	public UserDao userdao;
	public UserService userService;
	public UserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void qukuan(){
		userdao.delete();
		}
	public void earnMoney(){
		User uer = new User();
		uer.setName("ss");
		uer.setPassword("123");
		userService.adduser(uer);
	}
	
}
