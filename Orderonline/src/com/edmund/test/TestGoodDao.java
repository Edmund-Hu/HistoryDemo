package com.edmund.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.edmund.dao.GoodDao;
import com.edmund.dao.UserDao;
import com.edmund.entity.Good;
import com.edmund.entity.User;



public class TestGoodDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  
	
		
		
		ApplicationContext act = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		GoodDao uc2 = (GoodDao) act.getBean("goodDao");
	
		String sql =" select * from good";

		List<Good> list = uc2.getGoods(sql);
		for( Good D :list){
		System.out.println(D.getGoodName());
		}
	}

}
