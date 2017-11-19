package com.edmund.dao;

import com.edmund.entity.User;



public class TestUserDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		User newusr =UserDao.getUser("vhudp2");
System.out.println(newusr);
		if(newusr.getUsername() == null){
			System.out.println("µÇÂ¼Ê§°Ü");
		}else{
			System.out.println("µÇÂ¼³É¹¦");
		}
		
		/*User[] users=UserDao.getUsers();
		for(User x:users){
			System.out.println(x);
		}*/
		
	}

}
