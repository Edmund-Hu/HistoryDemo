package com.edmund.service.imp;

import com.edmund.service.imp.UserService2;

public class UserServiceImp  implements UserService2 {

	@Override
	public void addUser(String name) {
		// TODO Auto-generated method stub
			System.out.println("这是service adduser方法"+name);
		//System.out.println(2/0);
	}

}
