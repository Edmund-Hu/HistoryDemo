package com.edmund.service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.stereotype.Service;

import com.edmund.dao.CartDao;
import com.edmund.dao.GoodDao;
import com.edmund.dao.OrderDao;
import com.edmund.dao.UserDao;
import com.edmund.entity.Cart;
import com.edmund.entity.Good;
import com.edmund.entity.Order;
import com.edmund.entity.Orderdetail;
import com.edmund.entity.User;
@Service
public class ShoppingCartService{
	@Resource
	CartDao cartDao;
	@Resource
	GoodDao gDao;
	@Resource
	OrderDao oDao;
public void addCart(int goodId,int userId,HttpServletRequest request,HttpServletResponse response){
	
	response.setContentType("text/html; charset=gb2312");
	String sql1="select * from shoppingcart where userid="+userId+" and goodid="+goodId;
	String sql4="select * from good where goodid="+goodId;
	Good good = gDao.getGood(sql4);
	Cart cart= cartDao.getCart(sql1);
	String message = null;
	if(cart==null){
	String sql ="insert into shoppingcart(userid,goodid,count) values("+userId+","+goodId+",1)";
	cartDao.updateCart(sql);
	}else{
		
		int count = cart.getCount();
		if(good.getGoodcount()>count){
			count++;
			 message="添加购物车成功！";
		}else{
			message="货物库存不足！";
				}
		
		String sql3 = "update shoppingcart set count="+count+" where userid="+userId+" and goodid="+goodId;
		//System.out.println(sql3);
		System.out.println(sql3);
		cartDao.updateCart(sql3);
		
	}

			try {
				PrintWriter out = response.getWriter();	
				 out.print(message);
				out.close();
			} catch (IOException e) {
				System.out.println("����쳣");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}	


public void toCart(int userId,HttpServletRequest request,HttpServletResponse response){
	String sql =" select * from shoppingcart where userid="+userId;
	List<Cart> listcart =cartDao.getCarts(sql);
	List<Object[]> listobj = new ArrayList<Object[]>();
	for(Cart cart : listcart){
		int goodid = cart.getGoodId();
		String sql1="select * from good where goodid="+goodid;
		Good good = gDao.getGood(sql1);
		Object[] objects = {cart,good};
		listobj.add(objects);
	}
	request.setAttribute("mycarts", listobj);
}

public List<Orderdetail> getOrderdetails(String orderJson){
	
	JSONArray array = JSONArray.fromObject(orderJson);

	List<Orderdetail> list = new ArrayList<Orderdetail>();
	for(Object ob:array){
		JSONObject jObject = JSONObject.fromObject(ob);
		Orderdetail shop = (Orderdetail)JSONObject.toBean(jObject,Orderdetail.class);
		list.add(shop);
	}

	return list;
}

public void deleteCart(int goodId){
	String sql = "delete from shoppingcart where goodid="+goodId; 
	System.out.println(sql);
	cartDao.updateCart(sql);
}

public void insertOrder(int userid, String goodinfo,String totalmoney){
	String sql="insert into cusorder (userid,goodinfo,totalmoney) values("+userid+",\""+goodinfo+"\",'"+totalmoney+"')";
	System.out.println(sql);
	oDao.updateOrder(sql);
	
}

public void getOrders(int userId,HttpServletRequest request,HttpServletResponse response){
	String sql =" select * from cusorder where userid="+userId;
	//System.out.println(sql);
	List<Order> oList = oDao.getOrders(sql);
	
	request.setAttribute("myorders", oList);
}

public Order getOrder(int orderId){
	String sql =" select * from cusorder where orderid="+orderId;
	//System.out.println(sql);
	List<Order> oList = oDao.getOrders(sql);
	Order order = oList.get(0);
	return order;
}

public void updateOrder(int orderid){
	String sql="update cusorder set status='完成' where orderid="+orderid;
	System.out.println(sql);
	oDao.updateOrder(sql);
	
}

}
