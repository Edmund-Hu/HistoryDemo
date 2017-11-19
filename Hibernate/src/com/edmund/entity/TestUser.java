package com.edmund.entity;

import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edmund.dbutil.HibernateSessionFactory;

@Entity
public class TestUser {
public static void main(String[] args) {
//insert();
	update();
//query();delete();
}
public  static  void query(){
	Session session = HibernateSessionFactory.getSession();
	User user =(User) session.load(User.class, 3);
	System.out.println(user.getName());
	session.close();
}

public static void insert(){
	Session session = HibernateSessionFactory.getSession();
	User user = new User();
	user.setName("xiongxiong");
	user.setPassword("1234");	
	Transaction tr = session.beginTransaction();//开启一个事务
	session.save(user);
	tr.commit();//提交事务
	session.close();
}
public static void update(){
	Session session = HibernateSessionFactory.getSession();
	User user = (User)session.get(User.class, 1);
	user.setName("huanhuan");
	Transaction tr = session.beginTransaction();//开启一个事务
	session.save(user);
	tr.commit();//提交事务
	session.close();
}


public static void delete(){
	Session session = HibernateSessionFactory.getSession();
	User user = (User)session.get(User.class, 4);
	
	Transaction tr = session.beginTransaction();//开启一个事务
	session.delete(user);
	tr.commit();//提交事务
	session.close();
}



}
