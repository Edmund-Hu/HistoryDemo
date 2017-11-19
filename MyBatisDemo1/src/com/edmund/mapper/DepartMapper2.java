package com.edmund.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.edmund.entity.Depart;


public interface DepartMapper2{
	@Select("select * from depart where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="count",property="count"),
		@Result(column="id",property="users",many=@Many(select="com.edmund.mapper.UserMapper.findUserByDepartId"))
	})
	public Depart findDepartWithUsers(int id);


}
