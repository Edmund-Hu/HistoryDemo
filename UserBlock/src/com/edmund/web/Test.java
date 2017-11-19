package com.edmund.web;

public class Test {

	public static void main(String[] args) {
		mj.dConn();
		String username="vhudp";
	
		String sql="select username from userinfo where username="+"'"+username+"'";
		System.out.println(sql);
		System.out.println("链接");
		if(!mj.queryExist(sql,username)){
			System.out.println("不存在");
		}else{
			System.out.println("存在");
		}
	/*	String username2="Edmund";
		String password="18723";
		String sex="男";
		String email="edmund@163.com";
	
		if(mj.updatedata(username2, password, sex, email)){
			System.out.println("哈哈哈");
		}else{
			System.out.println("oooopoo");
		}*/
	}
}
