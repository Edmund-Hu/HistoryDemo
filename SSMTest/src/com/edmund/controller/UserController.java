package com.edmund.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edmund.entity.User;
import com.edmund.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private UserService  userService;
	
	
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
/*	@RequestMapping("register")
	public ModelAndView register(User user ){
		System.out.println(user);
		if (userService.insertUser(user)==1) {
			return new ModelAndView("sucess","user",user);
		}else {
			return new ModelAndView("fail","user",null);
		}
		
	}*/
	@RequestMapping("register")
	public String register(User user ){
		userService.updateUser(user);
		return "sucess";
	}
}
