package com.edmund.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.junit.Test;
import org.springframework.stereotype.Repository;

import com.edmund.entity.User;

@Repository("userDao")
public class UserDao {

	public void getuser(){
		Session session = HibernateSessionFactory.getSession();
		User user = (User) session.get(User.class, 1);
		System.out.println(user.getUsername());
		
		
	}
	

	public List<User> getuser(String username){
		Session session = HibernateSessionFactory.getSession();
	SQLQuery sq = session.createSQLQuery("select * from user where name = ?");
	sq.addEntity(User.class);
	sq.setParameter(0, username);
	List<User> list = sq.list();
	for (User user : list) {
		System.out.println(user.getPassword());
	}
	return list;
	
	
		
	}

}
