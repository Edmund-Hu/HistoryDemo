package com.edmund.web;

public class Test {

	public static void main(String[] args) {
		mj.dConn();
		String username="vhudp";
	
		String sql="select username from userinfo where username="+"'"+username+"'";
		System.out.println(sql);
		System.out.println("����");
		if(!mj.queryExist(sql,username)){
			System.out.println("������");
		}else{
			System.out.println("����");
		}
	/*	String username2="Edmund";
		String password="18723";
		String sex="��";
		String email="edmund@163.com";
	
		if(mj.updatedata(username2, password, sex, email)){
			System.out.println("������");
		}else{
			System.out.println("oooopoo");
		}*/
	}
}
