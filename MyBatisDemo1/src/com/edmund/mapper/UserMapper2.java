package com.edmund.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.edmund.entity.User;

public interface UserMapper2 {
	@Select("select * from user where id = #{id}")
	public User findUserById(int id);
	@Insert("insert into user values(null,#{name},default,#{age},#{departid})")
	public int insertUser(User user);
	@Update("update user set name = #{name}, "
			+ "age=#{age} where id = #{id}")
	public int updateUser(User user);
	@Delete("delete from user where id = #{id}")
	public int deleteUser(int id);
	@Select("select * from user")
	public List<User> findAllUser();
	@Select("select * from user")
		@Results({
			@Result(id=true, column="id",property="id"),
			@Result(column="name",property="name"),
			@Result( column="timm",property="timm"),
			@Result( column="age",property="age"),
			@Result( column="departid",property="depart", one=@One(select="com.edmund.mapper.DepartMapper.findDepartById")) 
			
		})
	public List<User> findUsersWithDepart();
	@SelectProvider(type=UserDynamicSQLProvider.class,method="selectProvider")
	public List<User> selectDynamic(Map<String, Object> map);
}
