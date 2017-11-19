package com.edmund.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edmund.entity.User;
import com.edmund.service.UserService2;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService2  userService2;
	
	
		
	
	@RequestMapping("/index")
	public String test1(String name){
		System.out.println(name);
		System.out.println(" 进入index");
		userService2.PrintUser();
		return "index";
	}
	
	
	@RequestMapping("/index2/{name}")
	public void test2(@PathVariable("name")String name ,HttpServletRequest request, HttpServletResponse response){
	System.out.println(name);
	
	}
	
	@RequestMapping(value="/index3",method=RequestMethod.GET)
	public String test3(User user){
		userService2.inserUser(user);
		return "index";
	}
	
	@RequestMapping("/index4")
	public String test3(String name ,HttpServletRequest request, HttpServletResponse response){
		request.setAttribute("name", name);
		return "index";  //默认情况就是转发，浏览器地址不变,要直接跳转就redirect:index
	}
	
	@RequestMapping("/index5")
	public ModelAndView test4(String username) {
		/*Map<String, Object> map = new HashMap<String,Object>();
		map.put("name", username);
		System.out.println(username);
		//第一个参数指的是视图层的JSP页面的名字，第二参数是一个map对象，里面保存了各种数据
		return new ModelAndView("index2",map);*/
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name",username);		
		modelAndView.setViewName("index2");
		return modelAndView;
	}
	
	
	
	
}
