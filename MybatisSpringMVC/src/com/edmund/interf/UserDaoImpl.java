package com.edmund.interf;

import java.util.List;

import com.edmund.entity.Article;
import com.edmund.entity.User;

public interface UserDaoImpl {
	//��ע�ⷽ���� selectUserByID ������ User.xml �������õ� select ��id ��Ӧ��<select id="selectUserByID"��
	 public User selectUserByID(int id);
	 public List<User> selectUsers(String userName); 
	 public void addUser(User user);
	 public List<Article> getUserArticles(int id);
}
