package com.edmund.mappers;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.edmund.entity.Depart;

public interface DepartMapper {
	@Select("select * from depart where id=#{id}")
	public Depart findDepartById(int id);
	
	@Select("select * from depart where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="count",property="count"),
		@Result(column="id",property="stutents",many=@Many(select="com.edmund.mappers.StudentMapper.selStuByGrageId"))
	})
	public Depart findDepartByIdWithStu(int id);
}
