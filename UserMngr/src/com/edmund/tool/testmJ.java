package com.edmund.tool;

import com.edmund.tool.mj;
import com.edmund.web.User;

public class testmJ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String username="vhudp";
	
		String sql="select username from userinfo where username="+"'"+username+"'";
		System.out.println(sql);
		System.out.println("����");
		if(!mj.queryExist(sql,username)){
			System.out.println("������");
		}else{
			System.out.println("����");
		}*/
		/*User a =mj.getUser("vhudp");
		System.out.println(a.getEmail());*/
		
		mj.modify("password", "username", "vhudp", "12345");
	}
	
	
	

}
