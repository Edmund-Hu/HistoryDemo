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
		
		//mj.modifyUser("password", "username", "vhudp", "12345");
		
		//mj.modifyMsg("message", "id", 22, "�ұ��޸���");
		//System.out.println(mj.getTotalPage(5));
		mj.insertMsg("ggdddqqqqru ", 3, "2015/9/7 12:23");
	}
	
	


}
