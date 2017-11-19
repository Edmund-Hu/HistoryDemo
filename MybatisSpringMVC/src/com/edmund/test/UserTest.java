package com.edmund.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;


import com.edmund.entity.Article;
import com.edmund.entity.User;
import com.edmund.interf.UserDaoImpl;

public class UserTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader; 

    static{
        try{
            reader    = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
    
    public static void main(String[] args) {
     /*   SqlSession session = sqlSessionFactory.openSession();
      */
        
        /* try {
        User user = (User) session.selectOne("com.edmund.entity.UserMapper.selectUserByID", 1);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        } finally {
        session.close();
        }*/
        //user.xml namespace 应改为：namespace="com.edmund.interf.UserDaoImpl"
  /*      try {
          UserDaoImpl userDao=session.getMapper(UserDaoImpl.class);
            User user = userDao.selectUserByID(1);
            System.out.println(user.getName());
            System.out.println(user.getAge());
            
        } finally {
            session.close();
         
        }*/
    	//UserTest.addUser();
        //UserTest.getUserList("%");
        UserTest.getUserArticles(1);
       
    }
    
    public static void getUserList(String userName){
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	UserDaoImpl userDao=session.getMapper(UserDaoImpl.class);
        	 User user = userDao.selectUserByID(1);
            List<User> users = userDao.selectUsers(userName);
            System.out.println(user.getName());
            for(User u:users){
                System.out.println(u.getName()+":"+u.getAge());
            }
            
        } finally {
            session.close();
        }
    }
    
    public static void addUser(){
        User user=new User();
        user.setAge(34);
        user.setName("小猫");
        user.setSex("男");
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	UserDaoImpl userDao=session.getMapper(UserDaoImpl.class);
        	userDao.addUser(user);
            session.commit();//手动提交事务，如果openSession(true),系统会自动提交事务
            System.out.println("当前增加的用户 id为:"+user.getId());
        } finally {
            session.close();
        }
    }

    public static void getUserArticles(int userid){
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	UserDaoImpl userDao=session.getMapper(UserDaoImpl.class);        
            List<Article> articles = userDao.getUserArticles(userid);
            for(Article article:articles){
                System.out.println(article.getTitle()+":"+article.getContent()+
                        ":作者是:"+article.getUser().getName()+":性别:"+
                         article.getUser().getSex());
            }
        } finally {
            session.close();
        }
    }

    

}

