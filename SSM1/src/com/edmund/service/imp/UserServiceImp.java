package com.edmund.service.imp;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.edmund.dao.UserDao;
import com.edmund.entity.User;
import com.edmund.service.UserService;

@Service("userService")

public class UserServiceImp  implements UserService {
	@Resource
	UserDao userDao;
	
/*	@Resource
	 private TransactionTemplate tx ;

	public void setTx(TransactionTemplate tx) {
		this.tx = tx;
	}*/

	@Override
	public int addUser(User user) {
/*		final int result =0;
		tx.execute(new TransactionCallbackWithoutResult() {
		
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				 userDao.addUser(user);
				userDao.deleteUser(1);
				log.info("进入用户service addUser方法");
			}
		
		});*/
	int result=	userDao.addUser(user);
			userDao.deleteUser(2);
			log.info("进入用户service addUser方法");
		return result;
	}

	

}
