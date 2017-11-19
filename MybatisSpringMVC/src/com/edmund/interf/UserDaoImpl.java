package com.edmund.interf;

import java.util.List;

import com.edmund.entity.Article;
import com.edmund.entity.User;

public interface UserDaoImpl {
	//请注意方法名 selectUserByID 必须与 User.xml 里面配置的 select 的id 对应（<select id="selectUserByID"）
	 public User selectUserByID(int id);
	 public List<User> selectUsers(String userName); 
	 public void addUser(User user);
	 public List<Article> getUserArticles(int id);
}
