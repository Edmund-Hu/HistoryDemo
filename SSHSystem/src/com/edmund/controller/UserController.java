package com.edmund.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edmund.dao.UserinfoDAO;
import com.edmund.entity.Userinfo;
import com.edmund.service.UserService;
import com.sun.net.httpserver.Authenticator.Success;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	UserService userService;
	
	@Resource
	UserinfoDAO userinfoDAO;
	
	
	@RequestMapping("/index")
	public String hello(HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入控制层");
		//userinfoDAO.getuserinf();
		userService.update();
		return "index";
	}
	@RequestMapping("/insert")
	public String insert(Userinfo user,HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入方法insert");
		Cookie[] Cookies = request.getCookies();
		String a = "";
		if(Cookies==null){
		}
		else
		{
		   for (int i=0;i< Cookies.length;i++){
		         if(Cookies[i].getName().equals("xxCookie")){
		       		a =Cookies[i].getValue();
		       		}
		         }
		}
		System.out.println(a);
		userService.save(user);
		return "success";
	}
	
	@RequestMapping(value="/ajax", method=RequestMethod.POST,produces="text/plain;charset=UTF-8")
	@ResponseBody  //单纯返回某个值，而不是页面
	public String checkUserName(String name,HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入ajax"+name);
		String msg = "成功了";
		
		return msg;
	}
	
	
	@RequestMapping(value="/testjson", method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody  //单纯返回某个值，而不是页面
	public Userinfo json(){
	System.out.println("test/json");
	Userinfo u = new Userinfo();
	 u.setUsername("ddd");
	 u.setPassword("dddxx1212");
	/* Userinfo u2 = new Userinfo();
	 u2.setUsername("ddd222");
	 u2.setPassword("dddxx1212ddddd222");
	List<Userinfo> list = new ArrayList<Userinfo>();
			list.add(u);
			list.add(u2);
			System.out.println(u2.getPassword());*/
		return u;
	}
	
}
