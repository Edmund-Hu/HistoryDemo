package com.edmund.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.edmund.entity.User;
import com.edmund.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/addUser.do")
	public String addUser(User user,HttpServletRequest request,HttpServletResponse response){
	int result = userService.addUser(user);
		if(result==1){
			userService.log.info("添加用户成功！");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			return "sucess";
			
		}else{
			return "index";
		}
		
	}
	
	   @RequestMapping(value = "/upload", method = RequestMethod.POST)
	    public String handleFormUpload(@RequestParam("name") String name,
	        @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
		   String path = request.getSession().getServletContext().getRealPath("/upload");
		   file.transferTo(new File(path+"/"+file.getOriginalFilename()));
		   System.out.println(file.getOriginalFilename());
		   System.out.println("上传成功！");
		   return "sucess";
	    }
	

}
