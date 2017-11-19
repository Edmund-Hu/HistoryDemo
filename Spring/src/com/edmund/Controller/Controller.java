package com.edmund.Controller;

import com.edmund.entity.User;
import com.edmund.service.UserService;

public class Controller {
	public UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	public void adduser(User user){
		userservice.adduser(user);
	}
	

}
