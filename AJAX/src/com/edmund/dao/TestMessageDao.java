package com.edmund.dao;

import com.edmund.tool.mj;
import com.edmund.entity.*;

public class TestMessageDao {
public static void main(String[] args) {
	String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b " +
			"where a.id=b.userid";
	Message[] msg=MessageDao.getMessages(sql);
	for(Message m:msg){
		System.out.println(m);
	}
	
}
}
