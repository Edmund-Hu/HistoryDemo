package com.edmund.Test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edmund.entity.Manange;

public class TestManage {
public static void main(String[] args) {
	ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
	Manange manange = (Manange) ctx.getBean("manage");
	System.out.println(manange.getUser().getName());
}
}
