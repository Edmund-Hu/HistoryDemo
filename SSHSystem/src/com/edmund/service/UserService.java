package com.edmund.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edmund.dao.UserinfoDAO;
import com.edmund.entity.Userinfo;

@Service("userService")
@Transactional
public class UserService {
	@Resource
	private  UserinfoDAO userinfoDAO;
	
	public void save(Userinfo user){
		System.out.println("进入方法服务层");
		userinfoDAO.save(user);
	}
	public void delete(){
		System.out.println("进入方法服务层");
		userinfoDAO.delete2();
	}
	public void update(){
		System.out.println("进入方法服务层");
		userinfoDAO.update();
	}
	
	
	
	
}
