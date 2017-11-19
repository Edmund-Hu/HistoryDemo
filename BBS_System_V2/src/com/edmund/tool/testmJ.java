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
		System.out.println("链接");
		if(!mj.queryExist(sql,username)){
			System.out.println("不存在");
		}else{
			System.out.println("存在");
		}*/
		/*User a =mj.getUser("vhudp");
		System.out.println(a.getEmail());*/
		
		//mj.modifyUser("password", "username", "vhudp", "12345");
		
		//mj.modifyMsg("message", "id", 22, "我被修改了");
		//System.out.println(mj.getTotalPage(5));
		mj.insertMsg("ggdddqqqqru ", 3, "2015/9/7 12:23");
	}
	
	


}
