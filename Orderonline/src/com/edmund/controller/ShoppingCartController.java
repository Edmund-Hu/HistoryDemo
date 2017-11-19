package com.edmund.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edmund.dao.CartDao;
import com.edmund.dao.GoodDao;
import com.edmund.dao.UserDao;
import com.edmund.entity.Good;
import com.edmund.entity.Order;
import com.edmund.entity.Orderdetail;
import com.edmund.entity.User;


import com.edmund.service.ShoppingCartService;
@Controller
@RequestMapping("/shopcart")
public class ShoppingCartController {
		@Resource
		UserDao userDao;
		@Resource
		GoodDao goodDao;


		@Resource
		ShoppingCartService shopservice;
		
		@RequestMapping("/a")
		public String aa(){
			return "HomePage";
		}
		
		@RequestMapping(value="/add",method=RequestMethod.GET)
		public void addCart(int goodId,int userId,HttpServletRequest request,HttpServletResponse response){
			shopservice.addCart(goodId, userId, request, response);
		
		}
		
		@RequestMapping(value="/jump",method=RequestMethod.GET)
		public String toCart(int userId,HttpServletRequest request,HttpServletResponse response){
			shopservice.toCart(userId, request, response);
			return "ShoppingCart";
		}
		
		@RequestMapping(value="/calculate",method=RequestMethod.POST)
		public String toOrder(String totalprice,String orderJson,HttpServletRequest request,HttpServletResponse response){
			List<Orderdetail> list = shopservice.getOrderdetails(orderJson);
			//订单生成后，将购物车里面已经购买的类容删除掉
			for(Orderdetail o: list){
				shopservice.deleteCart(o.getGoodId());
			}
			//将订单信息写入数据库
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("currentUser");
			int userid = user.getUserid();
			String goodinfo = orderJson;
				shopservice.insertOrder(userid, goodinfo,totalprice);
				shopservice.getOrders(userid, request, response);
			return "Order";
		}
		
		
		
		
		@RequestMapping(value="/order",method=RequestMethod.GET)
		public String toOrder1(HttpServletRequest request,HttpServletResponse response){
		
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("currentUser");
			int userid = user.getUserid();
		
				shopservice.getOrders(userid, request, response);
			return "Order";
		}
		
		
		
		
		
		
		
		
		@RequestMapping(value="/pay",method=RequestMethod.GET)
		public String pay(int orderId,HttpServletRequest request,HttpServletResponse response){
		
			//
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("currentUser");
			
			//获取订单总价并和用户的余额比较
			Order order = shopservice.getOrder(orderId);
			if(Double.parseDouble(order.getTotalmoney())<=user.getBalance()){
				//从用户账户扣除费用
				double remain = user.getBalance()-Double.parseDouble(order.getTotalmoney());
				System.out.println(remain);
				String sql = "update user set balance="+remain+" where userid="+user.getUserid() ;
				System.out.println(sql);
				userDao.updateUser(sql);
				//减少库存
				JSONArray jArray = order.getGoodinfo();
				List<Orderdetail> list = new ArrayList<Orderdetail>();
				for(Object ob:jArray){
					JSONObject jObject = JSONObject.fromObject(ob);
					Orderdetail orderdetail = (Orderdetail)JSONObject.toBean(jObject,Orderdetail.class);
					list.add(orderdetail);
					int num = orderdetail.getNum();
					int goodId = orderdetail.getGoodId();
					String sql1="select * from good where goodid=?";
					Good good = goodDao.getGood(sql1, goodId);
					int saletotal = good.getSaleTotal();
					int goodcount =orderdetail.getTotalcount();
					String sql2 ="update good set goodcount="+(goodcount-num)+" where goodid ="+goodId ;
					goodDao.updateGood(sql2);
					//统计历史销量
					String sql3 ="update good set saletotal="+(saletotal+num)+" where goodid ="+goodId ;
					goodDao.updateGood(sql3);
				}
				
		
				//修改订单状态
				shopservice.updateOrder(orderId);
					return "redirect:/shopcart/order";
				}else{
					return "fail";
				}
			
		
			
		}
	}

