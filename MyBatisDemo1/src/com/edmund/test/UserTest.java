package com.edmund.test;

import org.apache.ibatis.session.SqlSession;

import com.edmund.entity.User;
import com.edmund.mapper.UserMapper;
import com.edmund.util.SqlSessionFactoryUtil;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		UserMapper userDao = sqlSession.getMapper(UserMapper.class);
		User user = userDao.findUserById(3);
		System.out.println(user);
		
	/*	User user2  = new User();
		user2.setName("xxxxxxx");
		user2.setAge(65);
		int result = userDao.addUser(user2);
		sqlSession.commit();//提交事务
		if(result ==1){
			System.out.println("用户添加成功！");
		}*/
		
	}

}
