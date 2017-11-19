package com.edmund.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Resource
	UserDao udao;
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String inserUser(String username,String password,String phone,String address,
			HttpServletRequest request,HttpServletResponse response){
		String sql ="insert into user (username,password,phone,address) values('"+username+"','"
			+password+"','"+phone+"','"+address+"')";
			System.out.println(sql);
		if(udao.insertUser(sql)){
			request.setAttribute("message","恭喜您！注册成功！");
			System.out.println("注册成功！");
			return "RegisterSuccess";
		}
		
		return "Register";
	}
	
	@RequestMapping(value="/ajax",method=RequestMethod.GET)
	public void checkName(String name,HttpServletRequest request,HttpServletResponse response){

		String sql ="select * from user where username = ?";
		User user = udao.getuser(sql,name);
		String message ="";
		if(user==null){
			message= "true";
		}else{
			message= "false";
		}
		
		//写出
				try {
					response.getOutputStream().write(message.getBytes());
					//关闭流
					response.getOutputStream().close();
				} catch (IOException e) {
					System.out.println("输出异常");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
	}
	
}
