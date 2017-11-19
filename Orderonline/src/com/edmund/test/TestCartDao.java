package com.edmund.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.edmund.dao.CartDao;
import com.edmund.dao.GoodDao;
import com.edmund.dao.OrderDao;
import com.edmund.dao.UserDao;
import com.edmund.entity.Cart;
import com.edmund.entity.Order;
import com.edmund.entity.User;

public class TestCartDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext act = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		OrderDao orderDao = (OrderDao) act.getBean("orderDao");
	String sql ="select * from cusorder";
List<Order>  list= orderDao.getOrders(sql);
for (Order order : list) {
	System.out.println(order);
}
	}
}
