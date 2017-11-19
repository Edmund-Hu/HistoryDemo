package com.edmund.test;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.Article;
import com.edmund.entity.User;
import com.edmund.interf.UserDaoImpl;
import com.sun.istack.internal.logging.Logger;

public class SpringTest {
private static ApplicationContext ctx;  
    
    static 
    {  
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    }        
      
    public static void main(String[] args)  
    {  
    	UserDaoImpl mapper = (UserDaoImpl)ctx.getBean("userMapper"); 
        //����id=1���û���ѯ���������ݿ��е���������Ըĳ����Լ���.
        System.out.println("�õ��û�id=1���û���Ϣ");
        User user = mapper.selectUserByID(1);
        System.out.println(user.getName()); 
  
        //�õ������б����
        System.out.println("�õ��û�idΪ1�����������б�");
        List<Article> articles = mapper.getUserArticles(1);
        
        for(Article article:articles){
            System.out.println(article.getContent()+"--"+article.getTitle());
        }
        
    }  
    


}
