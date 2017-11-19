package com.edmund.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;

import com.edmund.tool.mj;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	UserDao userDao;

/*	@RequestMapping("/register")
	public String toRegister(){
		return "Register";
	}*/

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) throws UnsupportedEncodingException{
		System.out.println("进来了");
		System.out.println(username); 
		System.out.println(password);
		String sql ="select * from user where username = ?";
		User user = userDao.getuser(sql,username);
		if(user == null){
			request.setAttribute("message", "用户名不存在");
			return "HomePage";
		}else if(user.getPassword().equals(password)){
			request.setAttribute("message", "登陆成功！");
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			return "HomePage";
		}else{
			request.setAttribute("message", "密码错误！");
			return "HomePage";
		}
	
	}
	//向页面传值一
	@RequestMapping(value="/login1",method=RequestMethod.POST)
	public String login1(String name,String password,HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			//response.setContentType("text/html; charset=gb2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String name2 = new String(name.getBytes("ISO8859-1"),"UTF-8");
			System.out.println(name2);
			request.setAttribute("name", name2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
	}
	
	
	//向页面传值二
	@RequestMapping(value="/login2",method=RequestMethod.POST)
	public String login1(String name,String password,ModelMap map) throws UnsupportedEncodingException{
	
			String name2 = new String(name.getBytes("ISO8859-1"),"UTF-8");
			System.out.println(name2);
			map.put("name", name2);
		return "success";
	}
	
	//向页面传值三
	@RequestMapping(value="/login3",method=RequestMethod.POST)
	public String login1(User user,ModelMap map) throws UnsupportedEncodingException{
	
		//	String name2 = new String(name.getBytes("ISO8859-1"),"UTF-8");
			//System.out.println(user.getName());
			//map.put("name", user.getName());
		return "success";
	}
	
	//定向和重定向跳转；
	@RequestMapping("/test")
	public String testForward(){
		System.out.println("进入跳转");
		return "forward:/user/mmm"; //跳转到页面"forward:/WEB-INF/jsp/mmm.jsp"
		//return "redirect:/user/mmm";
	}
	
	
	@RequestMapping("/form")
	public String toform(){
		System.out.println("我进入了form方法");
		return "upload";
	}
	
	
	
	//文件上传方法
	   @RequestMapping(value = "/upload", method = RequestMethod.POST)
	    public String handleFormUpload(@RequestParam("name") String name,
	        @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
		   System.out.println(name);
		   String path = request.getSession().getServletContext().getRealPath("/upload");
		   System.out.println(path);
		   //String fullpath = path+"/"+file.getOriginalFilename();
		   file.transferTo(new File(path+"/"+file.getOriginalFilename()));
		   request.setAttribute("path", "upload/"+file.getOriginalFilename());
		   System.out.println(file.getOriginalFilename());
		   System.out.println("上传成功！");
	     return "success";
	    }
	//文件下载方法
	   @RequestMapping(value = "/download", method = RequestMethod.GET)
	 public String  download (String fileName,HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		   
		
		   String name = fileName.substring(7);
			System.out.println(fileName);
			//设置文件MIMe类型
			response.setContentType("multipart/form-data");
			//设置Content-Disposition
			response.setHeader("Content-Disposition", "attachment;filename="+name);
			//读取目标文件，通过response将目标文件写到客户端
			//获取文件的觉得路径
			 String path = request.getSession().getServletContext().getRealPath(fileName);
			InputStream in = new FileInputStream(path);
			OutputStream out = response.getOutputStream();
			//response.setContentType("text/html");
			//写文件
			int b ;
			while(-1!=(b=in.read())){
				out.write(b);
				out.flush();
			}
			out.close();
			in.close();
		   return null;
	   }
	   
	/*   //login判断
	   @RequestMapping(value = "/loginJudge", method = RequestMethod.POST)
	   public String loginJudge(User user,ModelMap map){
		 System.out.println("loginJudge");
		 User userdb = UserDao.getUser(user.getUsername());
		   if(userdb.getUsername()==null){
			   map.put("message", "用户名不存在");
		   }else if(userdb.getUsername()!=null&& mj.PWcache(user.getPassword()).equals(userdb.getPassword())){
			   map.put("message", "登录成功！");
		   }else{
			   map.put("message", "密码不正确！");
		   }
		   return "forward:/user/log";
	   }
	   
		@RequestMapping("/log")
		public String tofo(){
			System.out.println("我进入了login方法");
			return "Login";
		}*/
}

