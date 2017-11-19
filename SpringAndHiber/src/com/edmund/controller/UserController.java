package com.edmund.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	UserDao userDao;
	@RequestMapping("/test")
	public String aa(HttpServletRequest request){
		List<User> list = userDao.getuser("huanhuan");
		System.out.println(list);
		User user = list.get(0);
		request.setAttribute("user", user);
		return "test1";
	}
	
	

}
