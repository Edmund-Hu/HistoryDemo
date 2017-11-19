package com.edmund.dao;

import org.hibernate.Session;

import com.james.dbutile.HibernateSessionFactory;

public class Test {
public static void main(String[] args) {
	Session session = HibernateSessionFactory.getSession();
	User user = (User)session.get(User.class,1);
	System.out.println(user.getName());
}
}
