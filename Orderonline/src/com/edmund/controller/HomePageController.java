package com.edmund.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edmund.dao.GoodDao;
import com.edmund.entity.Good;

@Controller
@RequestMapping("/HomePage")
public class HomePageController {
	@Resource
	GoodDao  goodDao ;
	
	@RequestMapping(value="/jump" ,method=RequestMethod.GET)
	public String toHomePage(HttpServletRequest request,HttpServletResponse response){
		String sql = "select * from good";
		System.out.println(sql);
		List<Good> list = goodDao.getGoods(sql);
		HttpSession session = request.getSession();
		session.setAttribute("goodlist", list);
		return "HomePage";
	}
	
	
	@RequestMapping(value="/detail" ,method=RequestMethod.GET)
	public String toDetail(int goodId,HttpServletRequest request,HttpServletResponse response){
		String sql = "select * from good where goodid='"+goodId+"'";
		System.out.println(sql);
		Good good = goodDao.getGood(sql);
		request.setAttribute("good", good);
		return "details";
	}
	
}
